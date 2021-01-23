package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Барсик", 5),
                new Cat("Мурзик", 10),
                new Cat("Пушок", 3)
        };

        Plate plate = new Plate(13);
        int needFood = 0;
        for (Cat cat : cats) {
            if (!cat.eat(plate)) {
                needFood += cat.getAppetite();
            }
            System.out.println(cat.fullStatus());
        }
        // Если остались голодные коты, добавляем в тарелку нужное кол-во еды и кормим голодных.
        if (needFood > 0) {
            System.out.println("Кормим голодных");
            needFood -= plate.getFood();
            plate.increaseFood(needFood);
            for (Cat cat : cats) {
                if (!cat.getFull()) {
                    cat.eat(plate);
                    System.out.println(cat.fullStatus());
                }
            }
        }
        plate.info();
    }
}
