package com.hg;

public class Change {
    public static void main(String[] args) {
        int n =28;
        //1元
        System.out.println(n%5);
        //10元
        System.out.println(n/10);
        //5元
        System.out.println("10x"+(n/10)+" 5x"+(n-(n/10)*10-n%5)/5+" 1x"+n%5);
    }
}
