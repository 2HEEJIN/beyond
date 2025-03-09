package com.beyond.assiststream;

import com.beyond.assiststream.practice.D_ObjectStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        // 문자 변환 보조 스트림
        // new A_ByteToCharStream().method1();
        // new A_ByteToCharStream().method2();

        // 성능 향상 보조 스트림
        // new B_BufferedStream().fileSave();
        // new B_BufferedStream().fileRead();

        // 기본 타입 입출력 보조 스트림
        // new C_DataStream().fileSaveAndRead();

        // 객체 입출력 보조 스트림
        // new D_ObjectStream().fileSave();
        // new D_ObjectStream().fileRead();

        new D_ObjectStream().objectsSave();
        new D_ObjectStream().objectsRead();

        System.out.println("프로그램 종료");
    }
}
