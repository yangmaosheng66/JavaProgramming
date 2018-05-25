package com.chapter1;

public class Test1_10 {
    public static void main(String[] args){

        double runningsecond=(45*60+30);
        //首先定义跑步者跑步的时间，秒为单位
        double runninghour=(double)runningsecond/(60*60);
        /*转换为小时，这里必须把转换的值转为double类型，不然输出的是无限值，如果不用（double）这里的值为0.0，也可以是数值.0，这样就不用加double了*/
        double mile=14/1.6;
        double avespeed=mile/runninghour;
        System.out.println(avespeed);
    }
}
