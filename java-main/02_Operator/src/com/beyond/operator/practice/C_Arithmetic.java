package com.beyond.operator.practice;

public class C_Arithmetic {
    public void method1() {
        // 정수의 산술 연산
        int number1 = 10;
        int number2 = 3;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);
        System.out.println();
        
        // 실수의 산술 연산
        double dNumber1 = 35.0;
        double dNumber2 = 10.0;

        System.out.println(dNumber1 + dNumber2);
        System.out.println(dNumber1 - dNumber2);
        System.out.println(dNumber1 * dNumber2);
        System.out.println(dNumber1 / dNumber2);
        System.out.println(dNumber1 % dNumber2);
        System.out.println();

        // 문자의 산술 연산
        char ch = '홍';

        System.out.println((char)(ch + 1));
        System.out.println('a' + 'b');
        System.out.println();

        // 참고
        // System.out.println(5 / 0); // ArithmeticException
        // System.out.println(5 % 0); // ArithmeticException
        System.out.println(5 / 0.0); // Infinity
        System.out.println(5 % 0.0); // NaN(Not a Number)
        // 연산 결과가 Infinity인지 검사하는 메소드
        System.out.println(Double.isInfinite(5 / 0.0));
        // 연산 결과가 NaN인지 검사하는 메소드
        System.out.println(Double.isNaN(5 % 0.0));
    }
}
