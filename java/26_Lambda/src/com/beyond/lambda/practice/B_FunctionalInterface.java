package com.beyond.lambda.practice;

import com.beyond.lambda.practice.functional.A_Functional;
import com.beyond.lambda.practice.functional.B_Functional;
import com.beyond.lambda.practice.functional.C_Functional;

public class B_FunctionalInterface {
    public void method1() {
        A_Functional fi = null;

        fi = () -> {
            System.out.println("매개변수와 반환값이 없는 람다식 1");
        };

        // 실행문이 한 줄이라면 중괄호({}) 생략 가능
        fi = () -> System.out.println("매개변수와 반환값이 없는 람다식 2");

        fi.execute();
    }

    public void method2() {
        B_Functional fi = null;

        fi = (int a) -> {
            System.out.println(a * a);
        };

        fi = a -> System.out.println(a * 2);

        fi.execute(10);
    }

    public void method3() {
        int result = 0;
        C_Functional fi = null;

        fi = (int a, int b) -> {

            return a + b;
        };

        fi = (a, b) -> a * b;

        result = fi.execute(10, 20);

        System.out.println(result);
    }

    // 람다식에서 필드와 지역 변수 사용하기
    private int number = 100;

    public void method4(int arg) {
        int number = 200;
        A_Functional fi = null;

        // 람다식에서 지역변수(매개변수)를 이용할 때는 final, effectively final이어야 한다.
        //  - 지역변수는 람다식에서 읽는 것은 허용되지만, 람다식 내부 또는 외부에서 변경할 수 없다.
        //  - 초기화된 이후에 값이 한 번도 변경되지 않는 변수를 effectively final이라고 한다.

        // arg = 400;
        // number = 500;
        this.number = 600;

        // 람다식에서 사용되는 this는 람다식을 실행하는 객체의 참조이다.
        // 람다식은 외부 클래스에서 실행되므로 this는 람다식이 포함된 외부 클래스의 객체의 참조를 의미한다.
        fi = () -> {
            // arg = 400;
            // number = 500;

            System.out.println(arg);
            System.out.println(number);
            System.out.println(this.number);
        };

        fi.execute();
        System.out.println();

        // 익명 구현 객체에서 사용되는 this는 익명 구현 객체로 생성된 객체의 참조이다.
        // 익명 클래스는 새로운 클래스 인스턴스를 생성하므로 this가 익명 클래스 객체의 참조를 의미한다.
        fi = new A_Functional() {

            @Override
            public void execute() {
                 // arg = 400;
                 // number = 500;

                System.out.println(arg);
                System.out.println(number);
                // System.out.println(this.number);
            }
        };

        fi.execute();
    }
}
