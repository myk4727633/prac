package com.huxl.java8.chaptrer9;

/**
 *
 * @author huxl
 * @since 2019/12/5-18:36
 */
public interface B extends A{
    default void hello(){
        System.out.println("Hell from B");
    }
}
