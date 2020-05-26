package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

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
