package org.zhangzhuo.euma;

/**
 * Auther :${Mr.zhang}
 * Time:2020/9/15
 */
public enum  Demo {
    One("星期一",1),Two("星期二",2),
    Three("星期三",3),Four("星期四",4),
    Five("星期五",5),Six("星期六",6);
    private String name;
    private int num;

    Demo(String name, int num) {
        this.name = name;
        this.num = num;
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
