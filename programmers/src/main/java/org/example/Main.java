package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {5, 1, 4};

        for (int i = 0; i <= arr.length; i++){
            for (int j = 0; j < arr[i]; j++){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}