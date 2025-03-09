package com.beyond.lambda.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    @NonNull
    private String name;
    // private final String name;

    @NonNull
    private int age;

    private String gender;

    private int math;

    private int english;

    public int getSum() {
        return math + english;
    }

    public int getAvg(){
        return getSum() / 2;
    }
}
