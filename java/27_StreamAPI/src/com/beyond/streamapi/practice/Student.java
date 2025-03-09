package com.beyond.streamapi.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;

    private int age;

    private String gender;

    private int math;

    private int english;

    public double average() {

        return  (math + english) / 2.0;
    }

    @Override
    public int compareTo(Student student) {

        return this.age - student.age;
    }
}
