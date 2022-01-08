package com.hg;

import java.util.Scanner;

public class Simu2 {
    public static void main(String[] args) {
        int n = -1;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Please enter num:");
            System.out.println("buy item:");
            System.out.println("1) Dress:100");
            System.out.println("2) Sox:200");
            System.out.println("3) Bag:300");
            System.out.println("0) Exit");
            String s = scanner.next();
            n = Integer.parseInt(s);

            switch (n) {
                case 1:
                    total = total + 100;
                    System.out.println("Total=" + total);
                    break;
                case 2:
                    total = total + 200;
                    System.out.println("Total=" + total);
                    break;
                case 3:
                    total = total + 300;
                    System.out.println("Total=" + total);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("beep");
                    System.out.println("Total="+total);
                    break;
            }
           /* if(n==1){
                total+=100;
                System.out.println("Total="+total);
            }else if(n==2){
                total+=200;
                System.out.println("Total="+total);
            }else if(n==3){
                total +=300;
                System.out.println("Total="+total);
            }else if(n==0){
                break;
            }*/
        }
        System.out.println("Thank you");
        System.out.println("Total=" + total);
    }
}