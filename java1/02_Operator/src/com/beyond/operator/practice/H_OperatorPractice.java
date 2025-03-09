package com.beyond.operator.practice;

import java.util.Scanner;

public class H_OperatorPractice {
    /*
     * 실습 문제 1
     * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
     * 'A' ~ 'Z'까지 코드값으로 65 ~ 90까지의 숫자로 나열되어 있다.
     *
     * 예시)
     * 문자 하나 입력 > f
     * 사용자가 입력한 값이 대문자입니까? : false
     */
    public void practice1() {
        boolean result = false;
        char alphabet = '\u0000';
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자 하나 입력 > ");
        alphabet = scanner.nextLine().charAt(0);

        result = (alphabet >= 'A') && (alphabet <= 'Z');

        System.out.println("사용자가 입력한 값이 대문자입니까? " + result);
    }

    /*
     * 실습 문제 2
     *
     * 사용자한테 두 개의 정수값을 입력받아서
     * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다."
     * 아닌 경우 "결과가 100 보다 작습니다." 출력
     */
    public void practice2() {
        int num1 = 0;
        int num2 = 0;
        String result = "";
        Scanner scanner = new Scanner(System.in);

        System.out.printf("첫번째 정수값 입력 > ");
        num1 = scanner.nextInt();

        System.out.printf("두번째 정수값 입력 > ");
        num2 = scanner.nextInt();

        result = (num1 * num2 >= 100) ? "결과가 100 이상입니다." : "결과가 100 보다 작습니다.";

        System.out.println(result);
    }

    /*
     * 실습 문제 3
     *
     * 사용자한테 문자를 하나 입력받아서
     * 입력한 문자가 대문자이면 "알파벳 대문자이다."
     * 아닌 경우 "알파벳 대문자가 아니다." 출력
     */
    public void practice3() {
        char alphabet = '\u0000';
        Scanner sc = new Scanner(System.in);

        System.out.print("영문자 입력 > ");
        alphabet = sc.next().charAt(0);

        System.out.printf("%s", (alphabet >= 65 && alphabet <= 90) ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.");
    }

    /*
     * 실습 문제 4
     *
     * 두 정수를 입력받고 + 또는 - 를 입력받아서 계산을 출력하라
     * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
     *
     * 예시)
     *   첫 번째 수 > 3
     *   두 번째 수 > 4
     *   연산자 입력(+ 또는 -) > +
     *
     *   3 + 4 = 7
     */
    public void practice4() {
        int num1 = 0;
        int num2 = 0;
        String result = "";
        char operator = '\u0000';
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 > ");
        num1 = scanner.nextInt();

        System.out.print("두 번째 정수 > ");
        num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("연산자 입력(+ 또는 -) > ");
        operator = scanner.nextLine().charAt(0);

        result = (operator == '+') ? String.format("%d %c %d = %d", num1, operator, num2, (num1 + num2))
                : (operator == '-') ? String.format("%d %c %d = %d", num1, operator, num2, (num1 - num2))
                : "잘못 입력했습니다.";

        System.out.println(result);
    }

    /*
     * 실습 문제 5
     *
     * 키보드로 입력받은 하나의 정수가 짝수이면 "짝수이다."
     * 짝수가 아니면 "홀수이다"를 출력하세요.
     */
    public void practice5() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 > ");
        number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? "짝수이다." : "홀수이다.");

    }

    /*
     * 실습 문제 6
     * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
     * 인원 수와 사탕 개수를 키보드로 입력받고 1인당 동일하게 나눠가진
     * 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
     */
    public void practice6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원 수 : ");
        int people = scanner.nextInt();

        System.out.print("사탕 개수 : ");
        int candy = scanner.nextInt();

        System.out.println("1인당 사탕 개수 : " + candy / people);
        System.out.println("남는 사탕 개수 : " + candy % people);

    }

    /*
     * 실습 문제 7
     * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
     * 세 과목에 대한 합계(국어 + 영어 + 수학)와 평균(합계 / 3.0)을 구하세요.
     */
    public void practice7() {
        int kor = 0;
        int eng = 0;
        int math = 0;
        int sum = 0;
        double avg = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("국어 > ");
        kor = scanner.nextInt();

        System.out.print("영어 > ");
        eng = scanner.nextInt();

        System.out.print("수학 > ");
        math = scanner.nextInt();

        System.out.println();

        sum = kor + eng + math;
        avg = sum / 3.0;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);

    }

    /*
     * 실습 문제 8
     * 주민 번호를 입력받아 남자인지 여자인지 구분하여 출력하세요.
     */
    public void practice8() {
        String str = null;
        String gender = null;
        char genderCode = '\u0000';
        Scanner scanner = new Scanner(System.in);

        System.out.print("주민번호를 입력하세요 (- 포함) :  ");
        str = scanner.nextLine();

        genderCode = str.charAt(7);
        gender = (genderCode == '1' || genderCode == '3') ? "남자 " :
                (genderCode == '2' || genderCode == '4') ? "여자" : "잘못 입력하셨습니다";

        System.out.println(gender);
    }

    /*
     * 실습 문제 9
     * 3개의 정수를 키보드로 입력받아
     * 입력받은 정수가 모두 같으면 true, 아니면 false를 출력하세요
     */
    public void practice9() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 1 : ");
        num1 = scanner.nextInt();

        System.out.print("입력 2 : ");
        num2 = scanner.nextInt();

        System.out.print("입력 3 : ");
        num3 = scanner.nextInt();

        System.out.println((num1 == num2) && (num2 == num3));

    }
}
