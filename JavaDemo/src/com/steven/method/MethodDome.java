package com.steven.method;

public class MethodDome {
    public static void main(String[] args) {
//      实参：实际调用传递给它的参数
        int num = max(30, 30);
        System.out.println(num);
    }

//  形式参数：用来定义作用来的
    public static int max(int a, int b){
        int result =0;
        if (a == b){
            System.out.println("a = b");
            return 0;//终止方法
        }else if (a > b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }
}
