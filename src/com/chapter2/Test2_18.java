package com.chapter2;

import java.util.Scanner;

public class Test2_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("a     b      pow(a, b)");
        double a = 1.0;
        double b = 2.0;
        for(int i = 0;i < 5;i++){
            System.out.println((int)a + "     " + (int)b + "      " + (int)Math.pow(a,b));
            a++;
            b++;
        }
    }
}
