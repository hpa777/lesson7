package ru.geekbrains;

public class Cat {

    private final String name;

    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    private boolean full;

    public boolean getFull() {
        return this.full;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public boolean eat(Plate p) {
        this.full = p.decreaseFood(appetite);
        return this.full;
    }

    public String fullStatus() {
        String f = this.full ? "сытый" : "голодный";
        return String.format("%s %s.", this.name, f);
    }

}
