package com.company;

public class Cat extends Animal {

    public static final int CAT_MAX_RUN = 200;

    public Cat(String name) {
        super(name, CAT_MAX_RUN, 0);
    }

    @Override
    public void swim(int length) {
        System.out.printf("\nУпс! Коты не умеют плавать.");
    }
}
