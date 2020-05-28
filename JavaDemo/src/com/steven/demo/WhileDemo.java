package com.steven.demo;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 0;
        int sum =0;
//      当i<=100时，会一直执行while里面的代码；i>100时，不执行while里面的代码。
        while (i <= 100){
//          将相加的和赋值给sum
            sum = sum + i;
//          循环执行一次后，i自增一次
            i++;
        }
        System.out.println("100以内的整数和为：" + sum);
    }
}
