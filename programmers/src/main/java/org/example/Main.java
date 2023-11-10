package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        for (int i = 0; i <= arr.length/2; i++){
            if (arr.length % 2 == 0){
                int j = 1;
                arr[j] = arr[j] + n;
                j++;
            } else if (arr.length % 2 == 1) {
                arr[i*2] = arr[i*2] + n;
            }
        }
        System.out.println(arr);
    }
}