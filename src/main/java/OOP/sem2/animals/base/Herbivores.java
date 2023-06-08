package OOP.sem2.animals.base;

import OOP.sem2.animals.base.Animal;

public abstract class Herbivores extends Animal {
    // Класс в котором реализован метод feed

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "grass";
    }

}
