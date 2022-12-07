package org.example.Lesson7;

public class Plate {
    private int food;
    private int countOfFood;
    public Plate(int food){
        this.food = food;
    }
    public void decreaseFood(int appetite){
        if(!hasEnoughFoodFor(appetite)){
            System.out.println("Кто-то слишком много хочет!");
        }
        else{
            food = food - appetite;
        }
    }
    public void increaseFood(int countOfFood){
        System.out.println("Бог корма послал еще немного корма!");
    }
    public boolean hasEnoughFoodFor(int appetite) {
        return appetite < food;
    }
}
