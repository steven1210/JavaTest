package com.steven.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};

//      打印数组中所有的元素
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i] + "  ");
        }
        System.out.println();
        System.out.println("=====华丽丽的分割线=====");

//      使用增强型for循环打印数组中所有的元素,这种方式是取不到下标
        for (int array : arrays) {
            System.out.print(array + "  ");
        }
        System.out.println();
        System.out.println("=====华丽丽的分割线=====");

//      求和
        int sum = arrays[0];//将数组的第一个元素的值赋值给sum
//        i从1开始，可以减少一次循环，因为第0个元素的值已经赋值给sum了
        for (int i = 1; i < arrays.length; i++) {
            sum = sum + arrays[i];
        }
        System.out.println("总和为：" + sum);
        System.out.println("=====华丽丽的分割线=====");

//      通过方法输出数组的每一个元素
        printArray(arrays);
        System.out.println();
        System.out.println("=====华丽丽的分割线=====");

//      反转数组
        printArray(reverse(arrays));
    }

//  反正数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0,j = result.length-1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }
        return result;
    }

//  将数组作为参数
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "  ");
        }
    }
}
