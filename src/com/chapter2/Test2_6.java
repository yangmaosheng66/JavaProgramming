package com.chapter2;

import java.util.Scanner;

public class Test2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 0 and 1000: ");
        int number = input.nextInt();

        int a = number % 10;
        int b = number / 10 % 10;
        int c = number / 100 % 10;

        System.out.print("The sum of the digits is " + (a + b + c));
    }
}
