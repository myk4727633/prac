package com.huxl.base;


/**
 * 小米武汉面试
 *
 * @author huxl
 */
public class IntegerBase {
    public static void main(String[] args) {
        Integer a = 1; //默认会执行Integer.valueOf(i)方法
        Integer b = 1;
        Integer c = 2;
        Integer d = a + b;
        Long g = 2L;
        System.out.println(a);
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(a+b));
        System.out.println( g == (a+b));
        System.out.println(g.equals(((long)c)));
        System.out.println(a.equals(b));

        String s1 = "A";
        String s2 = "A";
        String s3 = new String("A");

        System.out.println(s1 == s2 );
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        /**
         * 交替打印机构
         */
        /**
         * Java Integer 缓存值 low -128 127 可以通过-D配置缓存值
         * -Djava.lang.Integer.IntegerCache.high=250
         *
         * 包装类的equals 方法不处理数据转型
         * 包装类的“==”运算在不遇到算数运算的情况下不会自动拆箱
         */

    }
}
