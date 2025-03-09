package com.beyond.linkedlist;

import com.beyond.linkedlist.practice.SinglyLinkedList;

public class Application {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        // addFirst(), addLast(), add 메소드 구현

        list.addFirst("사과");
        list.addFirst("딸기");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();


    }
}
