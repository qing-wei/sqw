package com.example.demo.thread.chapter5.chapter_5_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siqingwei on 2018/8/21.
 */
public class ProductListGenerator {
    public List<Product> generate(int size) {
        List<Product> products = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Product product = new Product(10, "Product" + i);
            products.add(product);
        }
        return products;
    }
}
