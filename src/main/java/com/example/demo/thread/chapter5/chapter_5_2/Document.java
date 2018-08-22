package com.example.demo.thread.chapter5.chapter_5_2;

import java.util.Random;

/**
 * Created by siqingwei on 2018/8/22.
 */
public class Document {
    private String[] words = new String[]{"the", "hello", "goodbye", "packt", "java", "thread", "pool", "random",
            "class", "main"};

    public String[][] generateDocument(int numLines, int numWords, String word) {
        int counter = 0;
        String[][] document = new String[numLines][numWords];
        Random random = new Random();

        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numWords; j++) {
                int index = random.nextInt(words.length);
                document[i][j] = words[index];
                if (word.equals(document[i][j])) {
                    counter++;
                }
            }
        }
        System.out.printf("DocumentMock: The word appears %d times in the document.\n", counter);
        return document;
    }
}
