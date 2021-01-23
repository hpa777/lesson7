package ru.geekbrains;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood(int n) {
        this.food += n;
    }

    public boolean decreaseFood(int n) {
        if (n > this.food) {
            return false;
        }
        food -= n;
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
