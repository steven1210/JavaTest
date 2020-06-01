package com.steven.method;

public class MethodAdd {
    public static void main(String[] args) {
        int result = add(20,30);
        System.out.println(result);

        double sum = add(50.0, 25.0);
        System.out.println(sum);

        int resultAdd = add(50.0, 30.0, 20.0);
        System.out.println(resultAdd);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }

    public static int add(double a, double b, double c){
        return (int)(a+b+c);
    }
}
