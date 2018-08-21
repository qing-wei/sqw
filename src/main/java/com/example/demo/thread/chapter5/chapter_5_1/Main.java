package com.example.demo.thread.chapter5.chapter_5_1;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/21.
 */
public class Main {
    public static void main(String[] args) {
        ProductListGenerator generator = new ProductListGenerator();
        List<Product> products = generator.generate(10000);
        Task task = new Task(products, 0, products.size(), 0.20);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(task);

        do {
            System.out.printf("Main: Thread Count: %d.\n", forkJoinPool.getActiveThreadCount());
            System.out.printf("Main: Thread Steal: %d.\n", forkJoinPool.getStealCount());
            System.out.printf("Main: Parallelism: %d.\n", forkJoinPool.getParallelism());
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!task.isDone());

        forkJoinPool.shutdown();

        if (task.isCompletedNormally()) {
            System.out.printf("Main: The process has completed nomally.\n");
        }

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getPrice() != 12) {
                System.out.printf("Product: %s %f.\n", product.getName(), product.getPrice());
            }
        }
        System.out.println("Main: End of the program.");
    }
}
