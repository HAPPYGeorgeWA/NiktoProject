package com.hg.Starsline;

public class Starsline5 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if(i==0||i==9){
                    System.out.print("*");
                }

                if(i>=2&i<=7){
                    if(j==1||j==18){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }

                if(i==1||i==8){
                    if(j==0||j==19){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}