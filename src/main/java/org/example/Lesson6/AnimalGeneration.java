package org.example.Lesson6;

public class AnimalGeneration {
    private int animalsCount;
    private int catsCount;
    private int dogsCount;

    public AnimalGeneration() {
        animalsCount = 0;
        catsCount = 0;
        dogsCount = 0;
    }

    public Cat newCat(int maxRunLimit) {
        Cat cat = new Cat(maxRunLimit);
        animalsCount++;
        catsCount++;

        return cat;
    }

    public Dog newDog(int maxRunLimit, int maxSwimLimit) {
        Dog dog = new Dog(maxRunLimit, maxSwimLimit);
        animalsCount++;
        catsCount++;

        return dog;
    }
    public int getAnimalsCount(){
        return animalsCount;
    }
    public int getCatsCount(){
        return catsCount;
    }
    public int getDogsCount(){
        return dogsCount;
    }
}