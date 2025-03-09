package com.beyond.array.practice;

import java.util.Arrays;

public class B_TwoDimensionalArray {
    // 2차원 배열의 선언 및 생성, 초기화 (new 연산자 사용)
    public void method1() {
        // 1) 2차원 배열의 선언 및 생성
        int[][] iArray;
        // int iArray[][];
        // int[] iArray[];

        iArray = new int[3][5];

        // 2) 2차원 배열의 초기화
        //   1  2  3  4  5
        //   6  7  8  9 10
        //  11 12 13 14 15
        int value = 1;

        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                iArray[i][j] = value++;
            }
        }

        // 3) 2차원 배열의 값을 출력
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[i].length; j++) {
                System.out.printf("%2d ", iArray[i][j]);
            }

            System.out.println();
        }
    }

    // 2차원 배열의 선언 및 생성, 초기화 (값의 목록 사용)
    public void method2() {
//        String[][] sArray = new String[][] {{"Linux", "MariaDB"}, {"Java", "Spring"}};
//        String[][] sArray = {
//            {"Linux", "MariaDB"},
//            {"Java", "Spring"},
//            {"HTML5", "CSS3", "Vue.js"}
//        };
        String[][] sArray = new String[3][];

        sArray[0] = new String[] {"Linux", "MariaDB"};
        sArray[1] = new String[] {"Java", "Spring"};
        sArray[2] = new String[] {"HTML5", "CSS3", "Vue.js"};

        for (int i = 0; i < sArray.length; i++) {
            for (int j = 0; j < sArray[i].length; j++) {
                System.out.printf("%s\t", sArray[i][j]);
            }

            System.out.println();
        }
    }

    /*
     * 실습 문제 1
     *
     * 1부터 10사이의 랜덤값을 3행 3열의 2차원 배열에 대입하시오.
     *
     * 예시)
     * 1 8 9
     * 8 3 3
     * 4 1 7
     */
    public void practice1() {
        int[][] array = new int[3][3];
        
        // 랜덤값을 2차원 배열에 대입
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        // 2차원 배열의 랜덤값을 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%2d ", array[i][j]);
            }

            System.out.println();
        }
    }

    /*
     * 실습 문제 2
     *
     * 1부터 10사이의 랜덤값을 3행 3열의 2차원 배열에 대입하시오.
     * 단, 랜덤 값에 중복을 제거해서 대입하시오.
     *
     * 예시)
     * 1 8 9
     * 6 4 5
     * 2 7 3
     */
    public void practice2() {
        int index = 0;
        int[] array = new int[9];
        int[][] newArray = new int[3][3];
        
        // 1. 1차원 배열을 이용해서 중복 제거 된 랜덤 값을 추출
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);

            // 중복 제거
            for (int j = 0; j < i; j++){
                if (array[i] == array[j]) {
                    i--;

                    break;
                }
            }
        }

        // System.out.println(Arrays.toString(array));
        
        // 2. 랜덤값을 2차원 배열에 대입
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[index++];
            }
        }

        // 3. 2차원 배열의 랜덤값을 출력
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.printf("%2d ", newArray[i][j]);
            }

            System.out.println();
        }
    }
}
