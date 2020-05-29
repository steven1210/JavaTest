package com.steven.demo;

public class ForDemo3 {
    public static void main(String[] args) {
        int j = 0;
        for(int i = 1; i <= 100;i++){
            //判断被5整除的数字，并打印出来
            if (i % 5 == 0){
                System.out.print(i + "\t");
                j++;
                //当超过5个时，就换行
                if(j%5==0){
                    System.out.println();
                }
            }
        }

        System.out.println("================");

        for (int i = 1; i<=100; i++){
            //判断被5整除的数字，并打印出来
            if (i % 5 ==0){
                System.out.print(i + "\t");
            }
            //当打印数字超过5个时，换行
            if (i % (5*5) == 0){
                System.out.println();
            }
        }
    }
}
