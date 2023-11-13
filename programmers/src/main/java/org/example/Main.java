package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
      int n = 3;
      for (int i = 0; i < numlist.length; i++){
          if (numlist[i] % n == 0){
              list.add(numlist[i]);
          }
      }
        System.out.println(list);
    }
}