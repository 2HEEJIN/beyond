package com.beyond.streamapi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class G_Collect {
    /*
        수집
          - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴 받을 수 있다.
     */
    public void method1() {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 24, "남자", 80, 45),
                new Student("김철수", 20, "남자", 50, 50),
                new Student("김영희", 20, "여자", 90, 90),
                new Student("이몽룡", 26, "남자", 80, 85),
                new Student("성춘향", 20, "여자", 100, 100)
        );

        // 학생들의 이름만 List 컬렉션으로 추출
        List<String> names = students.stream()
                                    // .map(student -> student.getName())
                                    .map(Student::getName)
                                    .collect(Collectors.toList());

        System.out.println(names);
        System.out.println();
        
        // 남학생들만 List 컬렉션으로 추출
        List<Student> list = students.stream()
                                    .filter(student -> student.getGender().equals("남자"))
                                    .toList();

        list.forEach(System.out::println);
        System.out.println();
        
        // 여학생들만 Set 컬렉션으로 추출
        Set<Student> set = students.stream()
                                .filter(student -> student.getGender().equals("여자"))
                                .collect(Collectors.toSet());

        set.forEach(System.out::println);
        System.out.println();
        
        // Map 컬렉션으로 추출 (key: 이름, value: Student 객체)
        Map<String, Student> map = students.stream()
//                        .collect(Collectors.toMap(s -> s.getName(), s -> s));
                        .collect(Collectors.toMap(Student::getName, Function.identity()));


//        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        map.forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, List<Student>> listMap = students.stream()
                            .collect(Collectors.groupingBy(Student::getGender));

        listMap.forEach((s, studentList) -> {
            System.out.println(s);
            studentList.forEach(System.out::println);
            System.out.println();
        });
    }
}
