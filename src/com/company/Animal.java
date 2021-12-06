package com.company;

public class Animal {

    private static int counter;
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    private Animal() {
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this();
        this.name = name;
        this.maxRunDistance = maxRun;
        this.maxSwimDistance = maxSwim;
    }

    public void run(int length) {
        if (maxRunDistance >= length) {
            System.out.printf("\n%s %s пробежал %dм", this.getClass().getSimpleName(), name, length);
        } else {
            System.out.printf("\n%s %s не смог пробежать %dм", this.getClass().getSimpleName(), name, length);
        }
    }

    public void swim(int length) {
        if (maxSwimDistance >= length) {
            System.out.printf("\n%s %s проплыл %dм", this.getClass().getSimpleName(), name, length);
        } else {
            System.out.printf("\n%s %s не смог проплыть %dм", this.getClass().getSimpleName(), name, length);
        }
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}
