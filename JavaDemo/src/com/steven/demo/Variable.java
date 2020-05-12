package com.steven.demo;

public class Variable {
/**
 *类变量：声明时前面需要添加 static 修饰符
 */
    static int allClicks = 0;

/**
 * 变量：声明时前面需要添加 final 修饰符
 */
    static final double PI = 3.14;

/**
 * 实例变量：从属于对象；如果不自行初始化，调用时就显示这个类型的默认值
 * 布尔值：默认值为false;
 * 除了基本类型，其余的默认值都是null;
 * */
    int x;
    String str = "Hello World";

    //main主函数
    public static void main(String[] args) {
//      声明变量
        int i = 1;
//      也可以同时定义多个同类型的变量，但不建议这么写
//      int a = 1, b = 2, c = 3 ;
//      建议写成这个，提高代码的可读性
        int a = 1; // 局部变量
        int b = 2;
        int c = 3;

        //实例变量调用
        Variable variable = new Variable();
        System.out.println(variable.str);
        System.out.println(variable.x);
        //类变量调用
        System.out.println(allClicks);
        //常量的调用
        System.out.println(PI*5*5);
    }
}
