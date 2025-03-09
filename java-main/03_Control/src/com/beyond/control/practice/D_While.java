package com.beyond.control.practice;

import java.util.Random;
import java.util.Scanner;

public class D_While {
    /*
        while 문
            [표현법]
                while (조건식) {
                    .. 실행 코드 ..
                    
                    [증감식, 분기문]
                }
     */

    // 1부터 랜덤값(1 ~ 10)까지의 합계
    public void method1() {
        int sum = 0;
        int random = (int)(Math.random() * 10 + 1);

        int i = 1;

        while (i <= random) {
            sum += i;

            i++;
        }

        System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
    }

    // 사용자에게 문자열을 입력받고 그 문자열을 출력한다.
    // 단, "exit" 문자열을 입력하면 프로그램을 종료한다.
    public void method2() {
        String str = null;
        Scanner sc = new Scanner(System.in);

//        while (true) {
//            System.out.print("문자열을 입력해 주세요. > ");
//            str = sc.nextLine();
//
//            if (str.equals("exit")) {
//                System.out.println("프로그램을 종료합니다.");
//
//                break;
//            }
//
//            System.out.println(str);
//        }

//        while (!str.equals("exit")) {
//            System.out.print("문자열을 입력해 주세요. > ");
//            str = sc.nextLine();
//
//            System.out.println(str);
//        }

        do {
            System.out.print("문자열을 입력해 주세요. > ");

            str = sc.nextLine();

            System.out.println(str);
        } while (!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }
}
