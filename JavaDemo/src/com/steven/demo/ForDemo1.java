package com.steven.demo;

public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        int peace = 0;
        for(int i = 0; i <= 100;i++){
            if(i%2==0){
                sum = sum + i;
            }else{
                peace = peace + i;
            }
        }
        System.out.println("100以内偶数和：" +sum);
        System.out.println("100以内奇数和：" +peace);
    }
}
