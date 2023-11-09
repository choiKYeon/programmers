package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str_list.length; i++){
            if (str_list[i].contains(ex)){
            }else {
                sb.append(str_list[i]);
            }
        }
        System.out.println(sb.toString());
    }
}


