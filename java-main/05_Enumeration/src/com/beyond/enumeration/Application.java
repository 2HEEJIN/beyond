package com.beyond.enumeration;

import com.beyond.enumeration.practice.Week;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Week today = Week.FRIDAY;

        // 열거 상수에서 제공하는 메소드
        System.out.println(today.name());
        System.out.println(today.ordinal());
        System.out.println(today.equals(Week.MONDAY));
        System.out.println(today.compareTo(Week.SUNDAY));

        // 열거 타입에서 기본적으로 제공하는 정적 메소드
        System.out.println(Week.valueOf("SATURDAY"));
        System.out.println(Arrays.toString(Week.values()));
        System.out.println();

        // 열거 타입에 속성 추가 후 확인
        System.out.println(today.getName());
        System.out.println(today.getShortName());
        System.out.println(today.getValue());
        System.out.println();
    }











}
