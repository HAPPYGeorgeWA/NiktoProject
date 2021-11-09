package com.hg.Starsline;

public class Starsline {
    public static void main(String[] args) {

        for (int i = 9; i>=0; i--) {
            for (int j = 0; j < 20; j++) {
                if (2*i==j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
