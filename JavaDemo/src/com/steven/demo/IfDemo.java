package com.steven.demo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strScanner = scanner.nextLine();

        if (strScanner.contains("Hello")){
            System.out.println(strScanner);
        }
        System.out.println("End");

        scanner.close();
    }
}
