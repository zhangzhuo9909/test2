package org.zhangzhuo.zhujie;

/**
 * Auther :${Mr.zhang}
 * Time:2020/9/22
 */
public class TestDemo {
    @Goods(id = 1,name = "zhangsan")
    static int way1(){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(way1());;
    }
}
