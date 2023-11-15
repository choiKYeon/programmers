package org.example;

import java.util.*;
// 2진수 변환 Integer.toBinaryString
public class Main {
    public static void main(String[] args) {
       int n = 15;
       int a = 0;
       int result = 0;
       String num = Integer.toBinaryString(n);
       for (int i = 0; i < num.length(); i++){
           if (String.valueOf(num.charAt(i)).equals("1")){
               a++;
           }
       }
        int n2 = n;
        int b = 0;
       while (true) {
           n2++;
           String num2 = Integer.toBinaryString(n2);
           for (int j = 0; j < num2.length(); j++) {
               if (String.valueOf(num2.charAt(j)).equals("1")){
                   b++;
               }
           }
           if (a == b){
               result = n2;
               break;
           } else {b = 0;}
       }
        System.out.println(result);
    }
}