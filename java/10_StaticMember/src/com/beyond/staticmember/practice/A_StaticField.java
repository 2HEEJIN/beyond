package com.beyond.staticmember.practice;

public class A_StaticField {
    // 정적 필드
    // 정적 필드는 객체들이 공유하면서 사용할 목적으로 선언한다.
    // 정적 필드는 프로그램이 실행될 때 해당 클래스가 로드되면서 생성되고 프로그램이 종료될 때 소멸된다.
    public static int number = 2;

    private static String message = "Hello World";

    // 정적 필드에 대한 Getter와 Setter 메소드 또한 static 키워드가 붙어야 한다.
    public static String getMessage() {
        return message;
    }

    public static void setMessage(String message) {
        A_StaticField.message = message;
    }
}
