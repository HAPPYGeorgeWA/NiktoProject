package com.hg;

import java.util.Scanner;

public class Kcord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int point = 0;
        while(point<=99){
            System.out.println("Point:"+point);
            String s = scanner.next();
            if(s.equals("k")){
                point =99;
            }else{
                int n =Integer.parseInt(s);
                point +=n;
            }
        }
        System.out.println("You loose!!!");
    }

}
