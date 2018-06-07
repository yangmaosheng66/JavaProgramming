package com.chapter3;

import java.util.Scanner;

public class Test3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int after = input.nextInt();

        String week[] = new String[]{"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};

        System.out.println("Today is " + week[today] + " and the future day is " + week[(today + after) % 7]);

    }
}
