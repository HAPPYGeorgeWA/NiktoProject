package com.hg.Starsline;

public class Starsline2 {
    public static void main(String[] args) {

        for (int i = 0; i<11; i++) {
            for (int j = 0; j < 21; j++) {
                if (2*i==20-j || 2*i==j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
