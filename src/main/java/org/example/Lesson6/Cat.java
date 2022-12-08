package org.example.Lesson6;

public class Cat extends Animal
{
    public Cat(float maxRunDistance) {
        super(maxRunDistance, Integer.MIN_VALUE);
    }
    @Override
    public void swimOn(float requiredDistance){
        System.out.println("Котики не предназначены для воды!\n");
    }
}
