package com.company;

import java.util.Scanner;

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
        int newNumerator = (numerator * other.getDenominator()) + (denominator * other.getNumerator());
        numerator = newNumerator;
        int newDenominator = denominator * other.getDenominator();
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
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
