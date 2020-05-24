package com.steven.demo;

public class TernaryConditionalOperator {
    public static void main(String[] args) {
        /**
         * 三元运算：？、：例：x ? y : z
         * 如果x==true，结果为：y；否则结果为：z
         */
        int score = 80;
        String type = score >= 60 ? "成绩及格" : "成绩不及格";
        System.out.println(type);

        /**
         * 字符串连接符：+ , String
         */
        int a = 1;
        int b = 2;
        System.out.println(a+b+"你好");
        System.out.println("你好"+a+b);
        /**
         * 会发现输出的结果不同，结果分别为：3 和 12；
         * 原因是：(a+b+"")，按照程序由左向右执行的顺序，先做了a+b的计算，然后再做字符串的拼接
         * (""+a+b)，按照程序由左向右执行的顺序，先做了""+a的字符串拼接，拼接的结果就是1（string）,然后再+b,还是字符串的拼接，所以结果就是12
         * 所以：在拼接的时候，字符串的位置不同，导致的结果也不同
         */
    }
}
