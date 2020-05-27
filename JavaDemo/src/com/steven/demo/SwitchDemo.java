package com.steven.demo;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("中等");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("其他");
        }
    }
}
