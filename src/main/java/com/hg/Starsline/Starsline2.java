package com.hg.Starsline;

public class Starsline2 {
    public static void main(String[] args) {

        for (int i = 0; i<10; i++) {
            for (int j = 0; j < 20; j++) {
                if (2*i==19-j || 2*i==j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
