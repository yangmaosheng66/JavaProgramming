package com.chapter3;

import java.util.Scanner;

public class Test3_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double dxy = a * d - b * c;
        if(dxy != 0) {
            double dx = e * d - b * f;
            double dy = a * f - e * c;
            double x = dx / dxy;
            double y = dy / dxy;

            System.out.println("x is " + x + " and y is " + y);
        }
        else
            System.out.println("The equation has no solution");
    }
}
