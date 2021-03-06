package com.company;

public class Marathon {

    public static void main(String[] args) {
        //Создать классы Собака и Кот с наследованием от класса Животное.
        //Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль.
        // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        //У каждого животного есть ограничения на действия
        // (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        //Добавить подсчет созданных котов, собак и животных.

        Animal[] animals = {
                new Cat("Jerry"),
                new Cat("Barsik"),
                new Dog("Ares", 1200, 200),
                new Dog("Barbos", 900, 100)
        };

        for (Animal a : animals) {
            a.run(100);
            a.swim(200);
            a.run(500);
            a.swim(300);
            System.out.println();
        }
        System.out.printf("\nВсего животных: %d\n", animals[animals.length - 1].getCounter());
    }
}
