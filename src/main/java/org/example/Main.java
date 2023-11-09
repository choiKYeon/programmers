package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        for (int i = 0; i < todo_list.length; i++){
            if (finished[i] == true){
                list.add(todo_list[i]);
            }
        }
        System.out.println(list);
    }
}


