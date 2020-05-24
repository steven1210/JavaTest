package com.steven.demo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = scanner.nextDouble();
        if (score >= 60){
            System.out.println("成绩及格");
        }else{
            System.out.println("成绩不及格");
        }

        scanner.close();
    }
}
