package com.hg.aaa;

import java.util.Random;

public class Dice {

    int point=0;
    public void roll() {
        System.out.println("rolling");
        Random random = new Random();
        point = random.nextInt(6) + 1;
    }
    public boolean isMax(){
        if(point==6){
            return true;
        }else{
            return false;
        }
    }
}
