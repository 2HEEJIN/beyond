package com.beyond.method;

import com.beyond.method.practice.A_Method;
import com.beyond.method.practice.User;

public class Application {
    public static void main(String[] args) {
        A_Method methodTest = new A_Method();
        
        // 1. 매개변수와 반환값이 없는 메소드 호출
        methodTest.method1();
        System.out.println();

        // 2. 매개변수가 없고 반환값이 있는 메소드 호출
        String msg = methodTest.method2();

        System.out.println(msg);
        System.out.println();

        // 3. 매개변수가 있고 반환값이 없는 메소드 호출
        methodTest.method3(10, 20);
        System.out.println();
        
        // 4. 매개변수가 있고 반환값이 있는 메소드 호출
        System.out.printf("10 X 20 = %d\n", methodTest.method4(10, 20));
        System.out.println();
        
        // 5. 매개변수로 객체를 전달받는 메소드 호출
        User user = new User("hong123", "1234", "홍길동");

        System.out.println(user.information());
        methodTest.method5(user);
        System.out.println(user.information());
        System.out.println();
        
        // 6. 매개변수로 가변인자를 전달받는 메소드 호출
//        System.out.println(methodTest.method6(new int[] {1, 2}));
//        System.out.println(methodTest.method6(new int[] {1, 2, 3, 4, 5}));
//        System.out.println(methodTest.method6(new int[] {}));
        System.out.println(methodTest.method6(1, 2));
        System.out.println(methodTest.method6(1, 2, 3, 4, 5));
        System.out.println(methodTest.method6());
    }
}
