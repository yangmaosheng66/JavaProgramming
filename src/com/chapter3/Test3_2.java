package com.chapter3;

import java.util.Scanner;

public class Test3_2 {
    public static void main(String[] args){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                (number1 + number2 + number3 == answer));
    }
}
