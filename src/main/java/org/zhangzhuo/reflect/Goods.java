package org.zhangzhuo.reflect;

import java.io.Serializable;
import java.util.Date;

/**
 * Auther :${Mr.zhang}
 * Time:2020/9/22
 */
public class Goods {
    private int id ;
    private String name;
    private Date nowDate;



    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nowDate=" + nowDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNowDate() {
        return nowDate;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }
}
