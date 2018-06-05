package com.chapter2;

import java.util.Scanner;

public class Test2_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int days = minutes / 60 / 24;
        int years = days / 365;
        int remainingDays = days - years * 365;

        System.out.print(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}
