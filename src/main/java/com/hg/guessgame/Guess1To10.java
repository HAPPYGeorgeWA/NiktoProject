package com.hg.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        Random random =new Random();

        int sec = random.nextInt(10)+1;
        System.out.println(sec);
        System.out.println("Please enter a number:");
        Scanner scanner= new Scanner(System.in);

        int n = 0;
        boolean end = false;
        while(n!=sec){
            String s = scanner.next();
            n=Integer.parseInt(s);
            if(n>sec){
                System.out.println("Smaller");
            }else if(n<sec){
                System.out.println("Bigger");
            }else if(n==sec){
                System.out.println("Bingo");
                break;
            }
        }
    }
}
