package com.hg;

public class Poker2 {
    public static void main(String[] args) {
        int n = 82;
        System.out.println((char)n);

        char[]types={'c','d','h','s'};
        String tt ="cdhs";
        System.out.println(tt.length());
        System.out.println(tt.charAt(1));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1)+""+tt.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
