package com.company;

import java.util.Scanner;
public class Main {

    public static void calculate() {
        Scanner in = new Scanner(System.in);

        System.out.println("Add, subtract, multiply, or divide?");
        String operator = in.next();

        if (operator.equals("add")) {
            System.out.println("input numerator 1:");
            int num1 = in.nextInt();
            System.out.println("Input denominator 1:");
            int dem1 = in.nextInt();
            Fraction first = new Fraction(num1, dem1);
            System.out.println("input numerator 2:");
            int num2 = in.nextInt();
            System.out.println("input denominator 2:");
            int dem2 = in.nextInt();
            Fraction second = new Fraction(num2, dem2);

            first.add(second);
            System.out.println(first);

        } else if (operator.equals("subtract")) {
            System.out.println("input numerator 1:");
            int num1 = in.nextInt();
            System.out.println("Input denominator 1:");
            int dem1 = in.nextInt();
            Fraction first = new Fraction(num1, dem1);
            System.out.println("input numerator 2:");
            int num2 = in.nextInt();
            System.out.println("input denominator 2:");
            int dem2 = in.nextInt();
            Fraction second = new Fraction(num2, dem2);

            first.subtract(second);
            System.out.println(first);

        } else if (operator.equals("multiply")) {
            System.out.println("input numerator 1:");
            int num1 = in.nextInt();
            System.out.println("Input denominator 1:");
            int dem1 = in.nextInt();
            Fraction first = new Fraction(num1, dem1);
            System.out.println("input numerator 2:");
            int num2 = in.nextInt();
            System.out.println("input denominator 2:");
            int dem2 = in.nextInt();
            Fraction second = new Fraction(num2, dem2);

            first.multiply(second);
            System.out.println(first);
        } else if (operator.equals("divide")) {
            System.out.println("input numerator 1:");
            int num1 = in.nextInt();
            System.out.println("Input denominator 1:");
            int dem1 = in.nextInt();
            Fraction first = new Fraction(num1, dem1);
            System.out.println("input numerator 2:");
            int num2 = in.nextInt();
            System.out.println("input denominator 2:");
            int dem2 = in.nextInt();
            Fraction second = new Fraction(num2, dem2);

            first.divide(second);
            System.out.println(first);
        }
    }

    public static void main(String[] args) {
        calculate();


    }
}
