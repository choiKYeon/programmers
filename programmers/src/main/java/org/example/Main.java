package org.example;

import java.util.*;
// 2진수 변환 Integer.toBinaryString
public class Main {
    public static void main(String[] args) {
        int brown = 20;
        int yellow = 16;
        int result = brown + yellow;
        int a = 0;
        int b = 0;
        int[] answer = {a, b};

        for (int i = 1; i < brown/2; i++){
            for (int j = 1; j <= i; j++){
                if (result == i * j){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
            if (i * i == result){
                answer[0] = i;
                answer[1] = i;
                break;
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}