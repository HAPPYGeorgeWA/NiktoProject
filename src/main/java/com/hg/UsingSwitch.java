package com.hg;

import java.util.Scanner;

public class UsingSwitch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a num:");
        String n = scanner.next();
        int s = Integer.parseInt(n);

        switch (s){
            case 1:
                System.out.println("Ame");
                break;

            case 2:
                System.out.println("Mumei");
                break;
            case 3 :
                System.out.println("Gura");
                break;

            default:
                System.out.println("other");
        }
        System.out.println("end");
    }
}
