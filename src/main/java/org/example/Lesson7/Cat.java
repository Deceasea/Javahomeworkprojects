package org.example.Lesson7;

public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;

    public Cat(int appetite, String name){
        isFull=false;
        this.appetite = appetite;
        this.name = name;
    }
    public void eat(Plate plate){
        if(plate.hasEnoughFoodFor(appetite) && !isFull){
            System.out.println(name + " " + "вкушать изволит!");
            plate.decreaseFood(appetite);
            isFull=true;
        }
        else if(!plate.hasEnoughFoodFor(appetite)){
            System.out.println(name + " " + "говорит: кожаный раб, я вижу дно! Немедленно исправь!");
        }
        else if (isFull) {
            System.out.println(name + "  уведомляет: пару часов можешь погулять, мое величество заморило червячка!" );

        }
    }
}
