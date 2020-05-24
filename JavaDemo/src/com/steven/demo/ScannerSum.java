package com.steven.demo;

import java.util.Scanner;

/**
 * 需求：实现计算用户输入数字的和以及平均值
 */

public class ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      和
        double sum = 0;

//      统计个数
        int count = 0;

//      平均值
        double avg = 0;

        while (scanner.hasNextDouble()){
//          使用nextDouble接收输入的数字
            double i = scanner.nextDouble();
//          数字个数+1
            count = count + 1;//count++
//          求和
            sum = sum + i;
        }
//      求平均值
        avg = sum/count;

        System.out.println(count +"个数的和:" + sum);
        System.out.println(count +"个数的和:" + avg);
        scanner.close();
    }
}
