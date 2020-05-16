package com.steven.demo;

/**
 * 算术运算符：+，-，*，/，%，++，--
 * 赋值运算符：=
 * 关系运算符：>，<，>=，<=，==，!=，instanceof
 * 逻辑运算符：&&，||，！
 * 位运算符：&，|，^，>>，<<，>>>
 * 条件运算符：？，：
 * 扩展赋值运算符：+=，-=，*=，/=
 */
public class Operation {
    public static void main(String[] args) {
        int a = 1;//“=”就是赋值运算符，是将1赋值给a
        int b = 2;
        System.out.println("a+b="+ a+b);
        System.out.println("a-b="+ (a-b));
        System.out.println("a*b="+ a*b);
        System.out.println("a/b="+ a/b);
        System.out.println("a%b="+ a%b);

        //关系运算符的结果只有：真(true)和假(false)
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        System.out.println("==========自增和自减===========");
//      自增（++）和自减（--）
        int i = 1;
        int j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        /**
         * 执行上面的代码结果是：i=2，j=1；会发现i和j的结果不一样；
         * 原因：当++在i的后面时，程序处理的过程是：
         *  1、先将i的值赋值给j，所以j的值就是1；
         *  2、然后i再自增，也就是执行：i = i+1,所以i的值就变成了2。
         */

        int c = 1;
        int d = ++c;
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        /**
         * 执行上面的代码结果是：c=2，d=2；会发现 c 和 d 的结果一样；
         * 原因：当++在c的前面时，程序处理的过程是：
         *  1、程序先执行c的自增，也就是执行：c = c+1,所以 c = 2
         *  2、然后将c的值赋值给d（也就是执行：d = c）,因为c先自增了，所以此时c的值2，所以c赋值给d的值也就是2。
         */

        int e = 2;
        int f = e--;
        System.out.println("f = " + f);
        System.out.println("e = " + e);
        /**
         *执行上面的代码结果是：e =1,f = 2;会发现e和f的结果不一样；
         *原因：当--在e的后面时，程序处理的过程是：
         *  1、先将 e的值赋值给f,也就是执行：f = e;所以f的结果就是2；
         *  2、然后再执行e自减，也就是执行：e = e -1；所以e的结果就是1。
         */

        int h = 2;
        int k = --h;
        System.out.println("h = " + h);
        System.out.println("k = " + k);
        /**
         * 执行上面的代码结果是：h =1,k = 1;会发现e和f的结果是一样；
         * 原因：当--在h的前面时，程序处理的过程是：
         *  1、程序会执行h的自减操作，也就是先执行：h = h -1；所以h的值是1；
         *  2、然后再将h的值赋值给k,也就是执行：k = h；所以k的结果是1。
         */
    }
}
