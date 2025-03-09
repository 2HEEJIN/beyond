package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("홍길동");
        person.setAge(32);
        person.setPhone("아이폰 15 프로", "네츄럴 티타늄", "애플");
        person.whoAreYou();
    }
}
