package com.hg;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end =false;
        int[]prices={15,20,25};
        while(!end){
            System.out.println("Please neter coin(1/5/10) Total: "+total);
            String s= scanner.next();

            switch (s){
                case "1":
                case "5":
                case "10":
                    int n = Integer.parseInt(s);
                    total +=n;
                    break;

                case"a":
                case"b":
                case"c":
                    int index=s.charAt(0)-97;
                    if(total>=prices[index]) {
                        System.out.println("Don!!!");
                        total-=prices[index];
                    }else {
                        System.out.println("Beep!!!");
                    }
                    break;

                case "0":
                    end = true;
                    break;
                default:
                    System.out.println("Beep!!!");
                    break;
            }
 /*
            try {
                int num = Integer.parseInt(s);
                switch (num) {
                    case 1:
                    case 5:
                    case 10:
                        total = total + num;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ah");
                if (s.equals("a")) {
                    System.out.println("A drink");
                    if (total >= aPrice) {
                        total = total - aPrice;
                        System.out.println("DON!");
                    } else {
                        System.out.println("BEEP!");
                    }
                }
            }
            */
            }
        System.out.println("END");
    }
}


