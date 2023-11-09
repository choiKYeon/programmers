package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana";

        for (int i = my_string.length() - 1; i >= 0; i--) {
            if (my_string.endsWith(is_suffix)) {
                System.out.println(1);
            } else {
                System.out.println(0);

                continue;
            }


            break;
        }
    }
}


