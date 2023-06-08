package OOP.HW2.animals.base;

import OOP.HW2.terrarium.Soundable;

public abstract class Animals implements Soundable {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract String sound(); // метод голос животного
    public abstract String feed(); // метод чем питается животное

    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s", name, feed());
        // То что будет выводиться
    }
}
