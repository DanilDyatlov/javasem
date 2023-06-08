package OOP.sem2.animals.base;

import OOP.sem2.animals.base.Animal;

public abstract class Predator extends Animal {
    // Класс в котором реализован метод feed

    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }

}
