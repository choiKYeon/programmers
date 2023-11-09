package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        myString = myString.replaceAll("A","b");
        myString = myString.replaceAll("B","a");
        myString = myString.toUpperCase();

        if (myString.contains(pat)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
        System.out.println(myString);


    }
}


