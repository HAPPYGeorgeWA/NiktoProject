package com.hg.aaa;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            dice.roll();
            System.out.println(dice.point);
            String s = dice.isMax()?"*":" ";
            System.out.println(s);
            /*if(dice.isMax()){
                System.out.println("*");
            }else{
                System.out.println();
            }*/

        }
    }
}
