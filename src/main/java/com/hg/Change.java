package com.hg;

public class Change {
    public static void main(String[] args) {
        int n =28;
        //10元
        System.out.println("10x"+n/10);
        //5元
        System.out.println("5x"+(n-(n/10)*10-n%5)/5);
        //1元
        System.out.println("1x"+n%5);


        System.out.println("10x"+(n/10)+" 5x"+(n-(n/10)*10-n%5)/5+" 1x"+n%5);
    }
}
