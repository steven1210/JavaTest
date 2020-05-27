package com.steven.demo;

public class SwitchString {
    public static void main(String[] args) {
        String name = "小明";

        switch (name){
            case "小王":
                System.out.println("小王的鞋子");
                break;
            case "小明":
                System.out.println("小明的伞");
                break;
            default:
                System.out.println("未知");
        }
    }
}
