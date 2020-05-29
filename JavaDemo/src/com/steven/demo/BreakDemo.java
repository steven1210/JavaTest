package com.steven.demo;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        for (i =0; i<= 10; i++){
            if(i == 6){
                break;
            }
            System.out.print(i +"\t");
        }

        System.out.println();
        System.out.println("======华丽的分割线=====");

        for (i =0; i<= 10; i++){
            if(i == 6){
                continue;
            }
            System.out.print(i +"\t");
        }
    }
}
