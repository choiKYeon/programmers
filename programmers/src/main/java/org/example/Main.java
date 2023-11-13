package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String answer = "";
        String cipher = "dfjardstddetckdaccccdegk";
        String[] str = cipher.split("");
        int code = 4;
        for (int i = 0; i <= cipher.length(); i++){
            if (i % 4 == 0 && i != 0){
                answer += str[i - 1];
            }
        }
        System.out.println(answer);
    }
}