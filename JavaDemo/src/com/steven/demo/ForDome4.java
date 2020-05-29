package com.steven.demo;

public class ForDome4 {
    public static void main(String[] args) {
        int[] numbers ={2, 5, 6, 7, 3, 4, 1, 8};

        for(int x : numbers){
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("======华丽的分割线=======");

        for(int i = 0;i <= numbers.length-1; i++){
            System.out.print(numbers[i] + "\t");
        }
    }
}
