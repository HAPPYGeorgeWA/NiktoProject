package com.hg.aaa;

public class Tester {
    public static void main(String[] args) {
        int []counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            Dice d2 = new Dice();

            System.out.println(dice.point);
            String s = dice.isMax()?"*":" ";
            System.out.println(s);



            /*if(dice.isMax()){
                System.out.println("*");
            }else{
                System.out.println();
            }*/
        counters[dice.point-1]++;

        }
        int max=0;
        int point=0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+" "+counters[i]+"times");
            if(counters[i]>max){
                max=counters[i];
                point=i+1;
            }
        }
    }
}