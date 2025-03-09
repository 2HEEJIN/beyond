package com.beyond.linkedlist;

import com.beyond.linkedlist.practice.SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 자바에서 제공하는 Linked List 테스트
//        List<String> list = new ArrayList<>();

//        // addFirst() 메소드 테스트 (JAVA 21부터 지원) - 결과 [딸기, 사과]
//        list.addFirst("사과");
//        list.addFirst("딸기");
//
//
//        System.out.println(list);
//        System.out.println();
//
//        // addLast() 메소드 테스트 (JAVA 21부터 지원) - [딸기, 사과, 포도, 키위]
//        list.addLast("포도");
//        list.addLast("키위");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
//        // add() 메소트 테스트 - 인덱스 사이에 데이터 추가
//        list.add(1, "수박");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
//        // get(), contains() 메소드 테스트
//        System.out.println(list.get(3)); // 포도 ()번 째 인덱스 가져오기
//        // 인덱스에 요소가 있는지 확인
//        System.out.println(list.contains("딸기")); // true
//        System.out.println(list.contains("바나나")); // false
//
//        // removeFirst(), removeLast(), remove() 메소드 테스트
//        list.removeFirst();
//
//        System.out.println(list);
//        System.out.println();
//
//        list.removeLast();
//
//        System.out.println(list);
//        System.out.println();
//
//        list.remove(0);
//
//        System.out.println(list);
//        System.out.println();
//
//        list.remove("포도");
//
//        System.out.println(list);
//        System.out.println();


        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        // addFirst(), addLast(), add 메소드 구현

        list.addFirst("사과");
        list.addFirst("딸기");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.addLast("포도");
        list.addLast("키위");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.add(0, "수박");
        list.add(5, "바나나");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        // list.add(2, "복숭아");
        list.add(5, "복숭아");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        // get(), contains() 메소드 구현
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(3));
        System.out.println(list.get(6));
        System.out.println();

        System.out.println(list.contains("딸기"));
        System.out.println(list.contains("두리안"));
        System.out.println(list.contains("바나나"));
        System.out.println(list.contains("참외"));
        System.out.println();

        list.removeFirst();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.remove(0);
        list.remove(3);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        list.remove("포도");
        list.remove("사과");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();


    }
}
