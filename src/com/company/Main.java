package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static int numeratorGet(){

        Scanner in = new Scanner(System.in);
        System.out.println("Input fraction 1:");
        String str = in.next();
        Pattern pattern = Pattern.compile("/ *");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String string1 = str.substring(0, matcher.start());
            String string2 = str.substring(matcher.end());
            int num1 = Integer.parseInt(string1);
            return num1;
        } else {
            return -1;
        }
    }

    public static void calculatev2() {

        /*for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }*/





        /*System.out.println("Input fraction 1");
        String s = in.next();
        char a = s.charAt(0);
        int num1 = Character.getNumericValue(a);
        char b = s.charAt(2);
        int dem1 = Character.getNumericValue(b);

        System.out.println("Input fraction 2");
        String s1 = in.next();
        char c = s1.charAt(0);
        int num2 = Character.getNumericValue(c);
        char d = s1.charAt(2);
        int dem2 = Character.getNumericValue(d);*/
    }

    public static int parseNum(String str) {
        Pattern pattern = Pattern.compile("/ *");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String string1 = str.substring(0, matcher.start());
            String string2 = str.substring(matcher.end());
            int num1 = Integer.parseInt(string1);
            return num1;
        } else {
            return -1;
        }
    }

    public static int parseDem(String str) {
        Pattern pattern = Pattern.compile("/ *");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String string1 = str.substring(0, matcher.start());
            String string2 = str.substring(matcher.end());
            int dem1 = Integer.parseInt(string2);
            return dem1;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to add, subtract, multiply, or divide?");
        String operator = in.next();
        System.out.println("Input fraction 1:");
        String str = in.next();


        System.out.println("Input fraction 2:");
        String str1 = in.next();

        Fraction first = new Fraction(parseNum(str), parseDem(str));
        Fraction second = new Fraction(parseNum(str1), parseDem(str1));

        if (operator.equals("add")) {
            first.add(second);
            System.out.println(first);
        } else if (operator.equals("subtract")) {
            first.subtract(second);
            System.out.println(first);
        } else if (operator.equals("multiply")) {
            first.multiply(second);
            System.out.println(first);
        } else if (operator.equals("divide")) {
            first.divide(second);
            System.out.println(first);
        }

    }
}
