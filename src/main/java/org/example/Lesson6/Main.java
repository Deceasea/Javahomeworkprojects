package org.example.Lesson6;

public class Main {
    public static void main(String[] args){
        AnimalGeneration generation = new AnimalGeneration();

        Cat cat = generation.newCat(200);
        Dog dog = generation.newDog(500,10);

        cat.runOn(150);
        cat.swimOn(5);

        dog.runOn(700);
        dog.swimOn(10);

        System.out.println("Всего животных: " + generation.getAnimalsCount());
        System.out.println("Котиков: " + generation.getCatsCount());
        System.out.println("Песелей: " + generation.getDogsCount());

    }









    //1. Создать классы Собака и Кот с наследованием от класса Животное.
    //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    //4. * Добавить подсчет созданных котов, собак и животных.
}
