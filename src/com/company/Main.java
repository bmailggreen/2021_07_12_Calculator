package com.company;

public class Main {



    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("3 + 2 = " + calc.add(3,2));
        System.out.println("3 - 2 = " + calc.sub(3,2));
        System.out.println("3 * 2 = " + calc.multiple(3,2));
        System.out.println("3 / 2 = " + calc.osztas(3,2));

    }
}
