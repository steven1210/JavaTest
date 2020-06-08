package com.steven.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[][] array = {{1,2}, {2,3}, {3,4}, {4,5}};
        System.out.println(array[0][0]);

        printArray(array);
    }

//  打印二位数组里面的元素
    public static void printArray(int[][] arrays){
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++){
                System.out.print(arrays[i][j] + "\t");
            }
        }
    }
}
