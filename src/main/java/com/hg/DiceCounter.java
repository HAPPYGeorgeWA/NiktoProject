package com.hg;

public class DiceCounter {
    public static void main(String[] args) {
        int []counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            System.out.print(dice.point);
            System.out.println(dice.isMax() ?"*":"");
            counters[dice.point-1]++;

        }
        int max = 0;
        int point=0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counters[i]+" times");
            if(counters[i]>max){
                max = counters[i];
                point=i+1;

            }

        }
    }
}
