package com.hg;

public class Poker {
   public static void main(String[] args) {
      int[]cards =new int[52];
      char[]types= {'c','d','h','s'};
      for (int i = 0; i < 52; i++) {
         cards[i]=i;
      }

      for (int i = 0; i < 52; i++) {
         if(i%13==0&& i!=0){
            System.out.println();
         }
         char flower = types[cards[i]/13];
         System.out.print(cards[i]%13+1+""+flower+" ");
      }
   }
}
