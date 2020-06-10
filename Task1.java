package com.jetbrains.Pro.Tutorialfour;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
       Random random = new Random();
       int count = 1;
       int maxLimit = 11;
       int num = 1;

       do {
           num = random.nextInt(maxLimit);
           if (num == 7) {
               System.out.println("Lucky 7!");
           }else {
               System.out.println("Number "+count+" was "+num);
           }
           count += 1;
       }while (num != 0);
    }
}
