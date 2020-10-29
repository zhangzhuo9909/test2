package org.zhangzhuo.demo;

/**
 * Auther :${Mr.zhang}
 * Time:2020/10/8
 */
public class DemoClass2 {
    private static DemoClass2 instance = null;

    private DemoClass2(){};

    static DemoClass2 getInstance(){
        if(instance == null){
            instance = new DemoClass2();
        }
        return instance;
    }
}
