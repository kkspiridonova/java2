package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создание объекта класса Scanner и передаем ему стандартный поток ввода
        System.out.println("Введите a:");//Вывод строки
        double a = in.nextDouble();//Считывание числа с клавиатуры
        System.out.println("Введите b:");//Вывод строки
        double b = in.nextDouble();//Считывание числа с клавиатуры
        System.out.println("Введите c:");//Вывод строки
        double c = in.nextDouble();//Считывание числа с клавиатуры
        if (((a == b)&&(a!=c)&&(b!=c)) || ((a == c)&&(a!=b)&&(c!=b)) || ((b == c)&&(a!=c)&&(b!=a))){
            System.out.println("a, b и c являются сторонами равнобедренного треугольника.");
        }
        else if ((a == b) && (a == c) && (c == b)){
            System.out.println("a, b и c являются сторонами равностороннего треугольника.");
        }
        else if((Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))||
                (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2))||
                (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2))){
            System.out.println("a, b и c являются сторонами прямоугольного треугольника.");
        }
        else if((a+b<=c)||(b+c<=a)||(a+c<=b)){
            System.out.println("a, b и c не являются сторонами треугольника.");
        }
        else{
            System.out.println("Это обычный треугольник.");
        }
    }
}


