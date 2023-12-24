package org.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите первое число: ");
        int b = scanner.nextInt();

        // First solution
        try {
            System.out.println((double) a/b);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }

        // Second solution
//        if (b != 0) {
//            System.out.println(a/b);
//        } else {
//            System.out.println("На ноль делить нельзя!");
//        }
    }
}