package com.beyond.lambda.practice;

import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class F_Operator {
    /*
        Operator
          - Operator 표준 함수적 인터페이스는 매개값과 리턴 값이 있는 apply() 추상 메소드를 가지고 있다.
          - apply() 추상 메소드는 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
     */

    public void method1() {
        Student student1 = new Student("홍길동", 25, "남자", 70, 80);
        Student student2 = new Student("성춘향", 25, "여자", 80, 90);

        // IntBinaryOperator : 두 개의 int 값을 연산해서 int 타입의 값을 리턴한다.
        IntBinaryOperator intBinaryOperator = (a, b) -> a * b;

        System.out.println(intBinaryOperator.applyAsInt(10, 20));

        // IntUnaryOperator : 한 개의 int 값을 연산해서 int 타입의 값을 리턴한다.
        IntUnaryOperator intUnaryOperator = a -> a * a * a;

        System.out.println(intUnaryOperator.applyAsInt(2));

        // BinaryOperator<T> : 두 개의 T 타입 객체를 연산해서 T 타입 객체를 리턴한다.
        BinaryOperator<Student> binaryOperator =
                (s1, s2) -> s1.getSum() > s2.getSum() ? s1 : s2;

        System.out.println(binaryOperator.apply(student1, student2));
        
        // 참고 - 인터페이스의 static 메소드 활용(maxBy())
        // BinaryOperator<Student> bo =
        //         BinaryOperator.<Student>maxBy((o1, o2) -> Integer.compare(o1.getSum(), o2.getSum()));
        BinaryOperator<Student> bo =
                BinaryOperator.maxBy((o1, o2) -> Integer.compare(o1.getSum(), o2.getSum()));

        System.out.println(bo.apply(student1, student2));
    }
}