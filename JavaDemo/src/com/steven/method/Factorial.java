package com.steven.method;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.f(3);
        System.out.println(result);
    }

    public  int f(int n){
        if(n == 1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
