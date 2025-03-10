package com.beyond.control.practice;

public class C_For {
    /*
        for 문
            [표현법]
                for (초기식; 조건식; 증감식) {
                    .. 실행 코드 ..
                }
     */
    
    // 1부터 10까지의 정수들의 합계를 출력
    public void method1() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i; // sum = sum + i;
            // System.out.println(i);
        }

        System.out.println("합계 : " + sum);
    }

    // 1부터 랜덤값(1 ~ 10)까지의 합계를 출력
    public void method2() {
        int sum = 0;

        // java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 발생시킬 수 있다.
        // random() 메소드 호출 시 -> 0.0 ~ 0.999999... 사이의 랜덤값을 발생(0.0 <= 랜덤값 < 1.0)
        // System.out.println(Math.random()); // 0.0 ~ 0.999999...
        // System.out.println(Math.random() * 10); // 0.0 ~ 9.999999...
        // System.out.println(Math.random() * 10 + 1); // 1.0 ~ 10.999999...System.out.println(Math.random() * 10 + 1); // 1.0 ~ 10.999999...
        // System.out.println((int)(Math.random() * 10 + 1)); // 1 ~ 10
        int random = (int) (Math.random() * 10 + 1);

        for (int i = 1; i <= random; i++) {
            sum += i; // sum = sum + i;
        }

        System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
    }

    // 2단 ~ 9단까지 출력
    public void method3() {
        for (int i =2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\n", i, j, (i * j));
            }

            System.out.println();
        }
    }
}
