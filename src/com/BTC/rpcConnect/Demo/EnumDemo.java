package com.BTC.rpcConnect.Demo;

public class EnumDemo {
    public static void main(String[] args) {
        printWeekDay(WEEK.SUNDAY);
    }

    //接收传入的参数，星期x，打印一句话，一个星期的第x天
    public static void printWeekDay(WEEK week){
        switch (week){
            case MONDAY:
                System.out.println("这时一个星期的第一天");
                break;
            case TUESDAY:
                System.out.println("这时一个星期的第二天");
                break;
            case WEDNEWDAY:
                System.out.println("这时一个星期的第三天");
                break;
            case THURSDAY:
                System.out.println("这时一个星期的第四天");
                break;
            case FRIDAY:
                System.out.println("这时一个星期的第五天");
                break;
            case SATURDAY:
                System.out.println("这时一个星期的第六天");
                break;
            case SUNDAY:
                System.out.println("这时一个星期的第七天");
                break;
        }

    }
}
