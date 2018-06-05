package com.chapter2;

import java.util.Scanner;

public class Test2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis() + offset * 60 * 60 * 1000;

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;          //Console is wrong

        System.out.println("The current time is " + currentHour + ":" +
        currentMinute + " " + currentSecond);
    }
}
