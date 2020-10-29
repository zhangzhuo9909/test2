package org.zhangzhuo.demo;

/**
 * Auther :${Mr.zhang}
 * Time:2020/10/8
 */
public class DemoClass {
    private static DemoClass instance = new DemoClass();

    private DemoClass(){};

    static DemoClass getInstance(){
        return instance;
    }
}
