package com.steven.array;

import java.util.Arrays;

/**
 * 冒泡排序
 * 思路：
 * 1、比较数组中，两个相邻的元素，如果第一个数比第二个数大，我们就交换他们的位置；
 * 2、每一次比较，都会产生一个最大数，或者最小数；
 * 3、下一轮则可以少一次排序；
 * 4、一依次循环，直到结束；
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 7, 4, 8, 2, 6, 1, 9, 0, 55, 22, 66, 33};

//      将排序后数组放入到result数组中
        int[] result = bubbleSort(array);
//      打印数组
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] arrays){
//      定义一个临时变量，用户交换数据使用
        int temp = 0;
//      外循环，判断需要循环多少次
        for (int i = 0; i < arrays.length-1; i++) {
//          内循环，如果后一个数比前一个数大，就交换位置
            for (int j = 0; j < arrays.length-1-i; j++){
                if (arrays[j+1] > arrays[j]){
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }
}
