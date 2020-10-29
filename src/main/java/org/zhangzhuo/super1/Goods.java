package org.zhangzhuo.super1;

/**
 * Auther :${Mr.zhang}
 * Time:2020/9/15
 */
public final class Goods {
    private String name;
    private int num;

    public Goods(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
