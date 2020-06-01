package com.steven.demo;

/**
 * 打印 5行的三角形
 */
public class SquareDemo {
    public static void main(String[] args) {
        //等腰三角形
        System.out.println("等腰三角形:");
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("直角三角形:");
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("倒直角三角形：");
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
