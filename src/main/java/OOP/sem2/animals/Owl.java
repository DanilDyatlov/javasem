package OOP.sem2.animals;

import OOP.sem2.FlySpeed;
import OOP.sem2.RunSpeed;
import OOP.sem2.animals.base.Bird;

public class Owl extends Bird implements FlySpeed, RunSpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Ух-Уух";
    }

    @Override
    public String feed() {
        return "мышки, грызуны";
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }
}
