package com.example.demo.thread.chapter2.chapter_2_7;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class FileMock {
    private String[] contents;
    private int index;
    public FileMock(int size, int length) {
        contents = new String[size];
        for (int i = 0; i < size; i++) {
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int j = 0; j < length; j++) {
                int indice = (int) (Math.random() * 255);
                stringBuilder.append((char) indice);
            }
            contents[i] = stringBuilder.toString();
        }
        index = 0;
    }

    public boolean hasMoreLines(){
        return index < contents.length;
    }

    public String getLine(){
        if (this.hasMoreLines()) {
            System.out.println("Mock : " + (contents.length - index));
            return contents[index++];
        }
        return null;
    }
}
