package org.example;

import java.util.*;
// 2진수 변환 Integer.toBinaryString
public class Main {
    public static void main(String[] args) {
        int[] answer = new int[2];
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n = 3;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            if (list.contains(words[i])){
                answer = new int[]{(i % n) + 1, (int)Math.ceil((i + 1) / n)};
                break;
            }
            list.add(words[i]);

            if (i > 0) {
                if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                    answer = new int[]{(i % n) + 1, (int) Math.ceil((i + 1) / n)};
                    break;
                }
            }
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}