package OOP.sem2.animals.base;

import OOP.sem2.zoo.Soundable;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String sound(); // метод голос животного
    public abstract String feed(); // метод чем питается животное
    // В метод abstract мы можем ничего не писать, но следующие последники будут реализовывать метод по своему

    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s", name, feed());
        // То что будет выводиться
    }
}
