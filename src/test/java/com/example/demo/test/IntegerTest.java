package com.example.demo.test;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = new Integer(129);
        Integer b = new Integer(129);
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a == 129);
        Integer c = 17;
        Integer d = new Integer(17);
        System.out.println(c == d);
        System.out.println(c.equals(d));

        Integer e = 18;
        Integer f = 18;
        System.out.println(e == f);
        System.out.println(e.equals(f));

        Integer g = 128;
        Integer h = 128;
        System.out.println(g == h);
        System.out.println(g.equals(h));
    }
}
