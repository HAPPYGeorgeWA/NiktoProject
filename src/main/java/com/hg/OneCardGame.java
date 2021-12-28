package com.hg;

import java.util.Random;

public class OneCardGame {
    public static void main(String[] args) {
        char[]types= {'S','H','D','C'};
        Random random = new Random();

        int []cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i]=i;
            System.out.print(cards[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < 52; i++) {
            int r =random.nextInt(52);
            int tmp=cards[i];
            cards[i]=cards[r];
            cards[r]=tmp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i]+" ");

        }
        System.out.println();

        System.out.println("computer's card:");
        int computer=cards[0];
        int point = computer%13+1;
        int type=computer/13;

        System.out.println(point+""+types[type]+"(" +computer+")");
        int player = random.nextInt(52);
        int playerpoint = player%13+1;
        int playerType = player/13;

        System.out.println(playerpoint+""+types[playerType]+"(" +player+ ")");
        if(playerpoint>point ||(playerpoint==point&&playerType>type)){
            System.out.println("you win");
        }else{
            System.out.println("you loose");
        }
    }
}
