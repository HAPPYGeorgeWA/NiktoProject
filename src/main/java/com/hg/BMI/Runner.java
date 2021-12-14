package com.hg.BMI;

public class Runner {
    public static void main(String[] args) {
        float weight = 70.7f;
        float height =  1.7f;
        float bmi = weight/(height*height);
        System.out.println(bmi);

        Person p = new Person(60.6f,1.7f);
        System.out.println(p.bmi());

    }
}
