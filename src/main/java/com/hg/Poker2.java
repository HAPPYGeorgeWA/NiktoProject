package com.hg;

public class Poker2 {
    public static void main(String[] args) {
        int n = 82;
        System.out.println((char)n);


        char[]types={'c','d','h','s'};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1)+""+types[i]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
