package org.example.Lesson6;

public class Animal {
    private float maxRunDistance;
    private float maxSwimDistance;

    public Animal (float maxRunDistance, float maxSwimDistance){
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }
    public void runOn(float requiredDistance) {
        if (requiredDistance > maxRunDistance){
            System.out.println("Не осилил" + " " + requiredDistance);
            System.out.println("Максималочка" + " " + maxRunDistance);
        }
        else {
            System.out.println("Дистанция" + " " + requiredDistance + " " + "Сделяль!");
        }
        System.out.println();
    }
    public void swimOn(float requiredDistance) {
        if (requiredDistance > maxRunDistance){
            System.out.println("Не поплыл" + requiredDistance);
            System.out.println("Максималочка" + maxSwimDistance);
        }
        else {
            System.out.println("Заплыв"+ " " + requiredDistance + " " +"Ихтиандр!");
        }
        System.out.println();
    }
}
