package com.chapter1;

public class Test1_11 {
    public static void main(String[] args) {
//        double second = 365 * 24 * 60 * 60;
//        double born = second / 7.0;
//        double death = second / 13.0;
//        double immigrant = second / 45.0;
//        double population = 312032486.0;
//        for (int i = 0; i < 5; i++) {
//            population = (int) (population + born - death + immigrant);
//            System.out.println("population " + (i + 1) + "=" + population);
//        }
            int nowpeople=312032486;
            double everyyearstimes=365*24*60*60;
            double born=everyyearstimes/7;
            double death=everyyearstimes/13;
            double  Immigration=everyyearstimes/45;
            int Firstyear=(int)(nowpeople+born+Immigration-death);
            int Secondyear=(int)(Firstyear+born+Immigration-death);
            int Thirdyear=(int)(Secondyear+born+Immigration-death);
            int Fourthyear=(int)(Thirdyear+born+Immigration-death);
            int Fivthyear=(int)(Fourthyear+born+Immigration-death);
            System.out.println(Firstyear);
            System.out.println(Secondyear);
            System.out.println(Thirdyear);
            System.out.println(Fourthyear);
            System.out.println(Fivthyear);

    }
}


