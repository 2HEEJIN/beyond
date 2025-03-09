package com.beyond.lambda;

import com.beyond.lambda.practice.H_MethodReference;

public class Application {
    /*
        람다식(Lambda Expressions)
          - 자바에서 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원한다.
          - 람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만 런타임 시에는 인터페이스의 익명 구현 객체를 생성한다.

          [표현법]
            ([자료형 매개변수, ...]) -> {
                // 실행 코드

                [return 반환값;]
            };

            예시)
                - () -> { ... }
                - (int a) -> { System.out.println(a); }
                - (a) -> { System.out.println(a); }
                - a -> System.out.println(a);
                - (int a, int b) -> { return a + b; }
                - (a, b) -> { return a + b; }
                - (a, b) -> a + b;
     */
    public static void main(String[] args) {
        // 람다식 테스트
        // new A_Lambda().method1();

        // 함수적 인터페이스 테스트
        // new B_FunctionalInterface().method1();
        // new B_FunctionalInterface().method2();
        // new B_FunctionalInterface().method3();
        // new B_FunctionalInterface().method4(300);
        
        // 표준 함수적 인터페이스 테스트
        // new C_Consumer().method1();
        // new D_Supplier().method1();
        // new E_Function().method1();
        // new F_Operator().method1();
        // new G_Predicate().method1();
        
        // 메소드 참조 테스트
        new H_MethodReference().method1();
    }
}
