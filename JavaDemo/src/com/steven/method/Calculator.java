package com.steven.method;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        result(grade, a, b);
    }

    public static void result(String grade, double a, double b){
        switch (grade){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
            break;
            default:
                System.out.println("输入错误");
        }
    }
}
