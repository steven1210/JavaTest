package com.steven.array;

public class ArrayDemo {
    public static void main(String[] args) {
//      声明数组
        int[] numbers;

//      创建数组
        numbers = new int[10];

//      给数组元素赋值
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

//      通常我们声明数组都是使用下面这种方式
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(arrays[10]);

        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
//          打印数组中每一个元素的值
            System.out.println(arrays[i]);
//          计算数组元素的和
            sum = sum + arrays[i];
        }
        System.out.println("总和为：" +sum);
    }
}
