package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0){
            answer = a*a + b*b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else if () {
            answer = Math.abs(a - b);
        }

    }
}