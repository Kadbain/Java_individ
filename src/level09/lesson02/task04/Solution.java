package com.javarush.test.level09.lesson02.task04;

/* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/

public class Solution
{
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }
    public static void method3()
    {
        method4();
    }

    public static int method4()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int deep = 0;
        for (StackTraceElement element : stackTraceElements) {

            deep++;

        }
        System.out.println(deep);
        return deep;
    }
}