package com.hg;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end =false;
        while(!end){
            System.out.println("Please neter coin(1/5/10) Total: "+total);
            String s= scanner.next();
            int n = Integer.parseInt(s);

            switch (n){
                case 1 :
                    total =total+1;
                    break;
                case 5:
                    total=total+5;
                    break;
                case 10:
                    total =total+10;
                    break;
                case 0:
                    end = true;
                    break;

                default:
                    break;
            }
        }
        System.out.println("END");


    }
}
