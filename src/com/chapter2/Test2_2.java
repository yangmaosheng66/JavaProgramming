package com.chapter2;

import java.util.Scanner;

public class Test2_2 {
    public static void main(String[] args){
        final double PI = 3.1415;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
