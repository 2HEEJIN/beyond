package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class A_Create {
    /*
        스트림의 종류
          - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
          - Stream<T>, IntStream, LongStream, DoubleStream
     */

    // 숫자 범위로 스트림을 생성하는 방법
    public void method1() {
        int sum = 0;
        IntStream stream = null;

        // 첫 번째 매개값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        // stream = IntStream.range(1, 10);
        // 첫 번째 매개값 ~ 두 번째 매개값까지의 값을 요소로 가지는 스트림 객체를 생성한다.
        stream = IntStream.rangeClosed(1, 10);

        // sum = stream.sum();
        // sum = stream.peek(value -> System.out.println(value)).sum();
        sum = stream.peek(System.out::println).sum();

        System.out.printf("sum = %d\n", sum);
        System.out.println();
    }

    // 배열로부터 스트림을 생성하는 방법
    public void method2() {
        String[] names = {"홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향"};

        // for 문을 사용하여 출력
        for (String name : names) {
            System.out.print(name + " ");
        }

        System.out.println();
        
        // 스트림을 사용하여 출력
        // Stream<String> stream = Arrays.stream(names);
        // Stream<String> stream = Arrays.<String>stream(names);
        // Stream<String> stream = Stream.of(names);
        Stream<String> stream = Stream.<String>of("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");

        // stream.forEach(name -> System.out.print(name + " "));
        // stream.distinct().forEach(name -> System.out.print(name + " "));
        stream.parallel().forEach(name -> System.out.print(name + " "));
        System.out.println();
    }

    // 컬렉션으로부터 스트림을 생성하는 방법
    public void method3() {
        List<String> names = Arrays.asList("홍길동", "이몽룡", "성춘향", "임꺽정", "성춘향");

        // for 문을 사용하여 출력
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }

        System.out.println();
        
        // 스트림을 사용하여 출력
        // Stream<String> stream = names.stream();
        Stream<String> stream = names.parallelStream(); // 병렬 처리

        // stream.forEach(name -> System.out.println(name));
        stream.forEach(System.out::println);

        System.out.println();
    }
}