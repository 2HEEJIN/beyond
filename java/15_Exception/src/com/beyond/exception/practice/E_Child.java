package com.beyond.exception.practice;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class E_Child extends D_Parent {
//    @Override
//    public void method() {
//        // 오버라이딩 시 예외를 throws 하지 않아도 된다.
//    }

//    @Override
//    public void method() throws IOException {
//        // 부모 클래스의 메소드와 같은 예외를 throws 하는 것은 가능하다.
//    }

//    @Override
//    public void method() throws FileNotFoundException {
//        // 부모 클래스의 메소드보다 하위 타입의 예외를 throws 하는 것은 가능하다.
//    }    @Override

    public void method() throws FileNotFoundException, EOFException {
        // 부모 클래스의 메소드보다 하위 타입의 예외들을 throws 하는 것은 가능하다.
    }

//    @Override
//    public void method() throws Exception {
//        // 부모 클래스의 메소드보다 상위 타입의 예외를 throws 하는 것은 불가능하다.
//    }
}