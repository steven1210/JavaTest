package com.steven.array;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] array = {9, 11, 4, 6, 2, 7, 5, 15};

//      对数组按照升序排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

//      对数组元素进行赋值
        Arrays.fill(array,5,7,3);
        System.out.println(Arrays.toString(array));
    }
}
