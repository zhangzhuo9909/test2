package org.zhangzhuo.reflect;

import java.lang.reflect.Field;

/**
 * Auther :${Mr.zhang}
 * Time:2020/9/22
 */
public class TestDemo {
    public static void main(String[] args) {
        try {
            Class<Goods> goodsClass = Goods.class;
            Object goods = goodsClass.newInstance();
            Field id = goodsClass.getDeclaredField("name");
            id.setAccessible(true);
            id.set(goods,"张三");
            Goods goods1 = (Goods)goods;
            System.out.println(goods1.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
