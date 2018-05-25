package com.chapter1;

import java.lang.Math;

public class Test1_7 {
    public static void main(String[] args){
        double a=6;
        double s=0;
        for(int i=1;i<=a;i++){
            s=s+Math.pow(-1,i+1)*1/(2*i-1);
        }
        System.out.println(4*s);
    }
}
