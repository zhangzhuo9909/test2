package org.zhangzhuo.demo;

/**
 * Auther :${Mr.zhang}
 * Time:2020/10/8
 */
public class MaoPao {
    public static void main(String[] args) {
        int a [] = {2,1,15,8,25,30,46,29,39,35};
        int b = 0;
        for (int i = 0 ;i <a.length - 1 ;i++){
            for (int j = 0; j < a.length - 1 ;j++){
                if(a[j] > a[j+1]){
                    b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }
        for (int i = 0; i < a.length ;i++){
            System.out.print(a[i]+"--");
        }
    }
}
