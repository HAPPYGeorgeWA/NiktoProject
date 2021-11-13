package com.hg;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        int n =-1;
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your coin:");

        while (n!=0) {
            String s = scan.next();
            if (s.equals("a")) {
                if(total>=10) {
                    System.out.println("Don");
                    total=total-10;
                }else {
                    System.out.println("Bee");
                }
            }else if (s.equals("b")) {
                if (total>=15) {
                    System.out.println("Don");
                    total = total-15;
                }else {
                    System.out.println("Bee");
                }
            }else if(s.equals("c")) {
                if (total>=20) {
                    System.out.println("Don");
                    total=total-20;
                }else {
                    System.out.println("Bee");
                }
            }else {
                n = Integer.parseInt(s);
                if (n!=0) {
                    total = total+n;
                }
            }
            System.out.println("Total:"+total);

        }
        System.out.println("Bye");
    }
}
