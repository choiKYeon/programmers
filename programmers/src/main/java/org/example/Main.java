package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        String s = "3people unFollowed me";
        String lastAnswer = "";
        String s1= s.toLowerCase();
        String[] strList = s1.split(" ");
        int j = 0;
        for (int i = 0; i < strList.length; i++){
            String[] strList2 = strList[i].split("");
            String s2 = " " + strList2[0].toUpperCase();

            String answer = "";
                for (int q = 1; q < strList2.length; q++) {
                    if (q != 0) {
                        answer += strList2[q];
                    }
                }
            System.out.println(answer);
            lastAnswer += s2 + answer;
        }
        System.out.println(lastAnswer.trim());

    }
}