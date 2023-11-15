package org.example;

import java.util.*;
// 2진수 변환 Integer.toBinaryString
public class Main {
    public static void main(String[] args) {
        String s = "cdcd";
       char[] str = s.toCharArray();
       Stack<Character> sList = new Stack<>();

       for (int i = 0; i < str.length; i++){
           char c = str[i];
           if (sList.empty()) sList.push(c);
           else {
               if (sList.peek() == c){
                   sList.pop();
               }else {
                   sList.push(c);
               }
           }
       }
        System.out.println(sList.empty() ? 1 : 0);
    }
}