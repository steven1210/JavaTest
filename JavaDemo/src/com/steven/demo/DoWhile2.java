package com.steven.demo;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i < 1){
            sum = sum + i;
            i++;
        }
        System.out.println("while循环结构结果：" + sum);

        System.out.println("#########最美分割线###########");

        do {
            sum = sum + i;
            i++;
        }while (i < 1);
        System.out.println("do-while循环结构结果：" + sum);
    }
}
