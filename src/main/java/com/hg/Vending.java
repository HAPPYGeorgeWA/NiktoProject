package com.hg;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int aPrice = 15;
        int bPrice =25;
        boolean end =false;
        while(!end){
            System.out.println("Please neter coin(1/5/10) Total: "+total);
            String s= scanner.next();

        try {
            int n = Integer.parseInt(s);
            switch (n){
                case 1:
                case 5:
                case 10:
                    total =total+n;
                    break;
                case 0:
                    end = true;
                    break;

                default:
                    break;
            }
        }catch (NumberFormatException e){

            if(s.equals("a")){
                if(total>=aPrice){
                    System.out.println("DON!!!");
                    total=total-aPrice;
                }else{
                    System.out.println("BEE!!!");
                }

            }
            if(s.equals("b")){
                if(total>=bPrice){
                    System.out.println("DON!!!");
                    total=total-bPrice;
                }else{
                    System.out.println("BEE!!!");
                }
            }
        }
        }
    }
}
