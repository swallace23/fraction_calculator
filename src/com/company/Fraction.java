package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator1, int denominator1){
        numerator = numerator1;
        denominator = denominator1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void add(Fraction other) {
        int newNumerator = numerator + other.getNumerator();
        numerator = newNumerator;
        int newDenominator = lcm(denominator, other.getDenominator());
        denominator = newDenominator;


    }

    public void subtract(Fraction other) {
        int newNumerator = (numerator * other.getDenominator()) - (denominator * other.getNumerator());
        numerator = newNumerator;
        int newDenominator = denominator * other.getDenominator();
        denominator = newDenominator;
    }

    public void multiply(Fraction other) {
        int newNumerator = numerator * other.getNumerator();
        numerator = newNumerator;
        int newDenominator = denominator * other.getDenominator();
        denominator = newDenominator;
    }

    public void divide(Fraction other) {
        int newNumerator = numerator * other.getDenominator();
        numerator = newNumerator;
        int newDenominator = denominator * other.getNumerator();
        denominator = newDenominator;
    }

    public static int lcm(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
