package com.hg;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Random random = new Random();
        int sec = random.nextInt(100) + 1;
        System.out.println(sec);
        int min = 1;
        int max = 100;
        boolean win = false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number " + min + " - " + max);
            Scanner scanner = new Scanner(System.in);
            String n = scanner.next();
            int num = Integer.parseInt(n);
            if (num > sec) {
                max = num;
            } else if (num < sec) {
                min = num;
            } else {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.println("You win");
        } else {
            System.out.println("You loose");
        }


    }
}