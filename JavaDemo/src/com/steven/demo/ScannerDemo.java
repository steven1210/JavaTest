package com.steven.demo;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

//      创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

//      使用next方法接收
        String strNext = scanner.next();
//      判断用户有没有输入字符串；scanner.hasNext()完整的写法是scanner.hasNext()==True;Java中默认把后面的省略。
        if(scanner.hasNext()){
            System.out.println("strNext：" + strNext);
        }

/*//      使用nextLine方法接收
        String strNextLine = scanner.nextLine();
//      判断用户有没有输入字符串
        if (scanner.hasNextLine()){
            System.out.println("strNextLine：" + strNextLine);
        }*/

//      凡是属于IO流的类如果不关闭，会一直使用资源，要养成好的习惯：用完就关掉。
        scanner.close();
    }
}
