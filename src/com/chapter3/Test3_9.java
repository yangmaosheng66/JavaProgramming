package com.chapter3;

import java.util.Scanner;

public class Test3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int f9 = input.nextInt();

        int isbn[] = new int[10];
        for(int i = 0;i < 9;i++){
            isbn[i] =(int)(f9 / Math.pow(10,8-i)) % 10;
            isbn[9] += isbn[i] * (i + 1);
            if(i == 8)
                isbn[9] %= 11;
            System.out.print(isbn[i] + isbn[9] == 10 ? "X" : isbn[9]);
        }
    }
}
