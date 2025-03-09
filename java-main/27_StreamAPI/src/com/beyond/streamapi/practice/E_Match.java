package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;

public class E_Match {
    /*
        매칭
          - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할을 한다.
          - allMatch(Predicate)
            모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
          - anyMatch(Predicate)
            최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사한다.
          - noneMatch(Predicate)
            모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사한다.
     */
    public void method1() {
        boolean result = false;
        int[] numbers = {2, 4, 6};

        result = Arrays.stream(numbers).allMatch(number -> number % 2 == 0);

        System.out.println(result);

        result = Arrays.stream(numbers).anyMatch(number -> number % 3 == 0);

        System.out.println(result);

        result = Arrays.stream(numbers).noneMatch(number -> number % 5 == 0);

        System.out.println(result);
    }

    public void method2() {
        boolean result = false;
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 45),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("홍길동", 24, "남자", 80, 45),
                new Student("이몽룡", 26, "남자", 80, 85)
        );

        // 남학생들 중에 평균이 80점 이상인 학생이 한 명이라도 존재하는지 확인하시오.
        result = students.stream()
                        .distinct()
                        .filter(student -> student.getGender().equals("남자"))
//                        .peek(s -> System.out.println(s.average()))
//                        .anyMatch(s -> s.average() >= 80);
//                        .mapToDouble(s -> s.average())
                        .mapToDouble(Student::average)
                        .anyMatch(average -> average >= 80);

        System.out.printf("남학생들 중 평균이 80점 이상인 학생이 있습니까?? %b\n", result);
        System.out.println();

        // 나이가 20살 이상인 학생들이 모두 남자인지 확인하시오.
        result = students.stream()
                        .distinct()
                        .filter(s -> s.getAge() >= 20)
//                        .peek(System.out::println)
                        .allMatch(s -> s.getGender().equals("남자"));

        System.out.printf("나이가 20살 이상인 학생들이 모두 남자입니까? %b\n", result);
    }









}
