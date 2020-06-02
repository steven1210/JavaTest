package com.steven.method;

/**
 * 可变参数，实现比大小
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        MethodDemo2 methodDemo2 = new MethodDemo2();
        //methodDemo2.printMax(9,8,7,5,6,4,3,1,2);//直接传参
        methodDemo2.printMax(new int[]{9,8,7,5,6,4,3,1,2});//传入的参数是数组
    }

//  方法中使用了可变参数
    public void printMax(int... numbers){
//      将可变参数中的第一个参数的值赋值给result
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(result == numbers[i]){
                System.out.println("两个值相等");
//              此处return的作用是用于跳出循环
                return;
            }else if (result < numbers[i]){
                result = numbers[i];
            }
        }
        System.out.println(result);
    }
}
