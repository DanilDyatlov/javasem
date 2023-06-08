package OOP.sem2.animals;

import OOP.sem2.FlySpeed;
import OOP.sem2.RunSpeed;
import OOP.sem2.SwimSpeed;
import OOP.sem2.animals.base.Bird;

public class Duck extends Bird implements RunSpeed, FlySpeed, SwimSpeed {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Кря";
    }

    @Override
    public String feed() {
        return "Все ем";
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, FlySpeed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getFlySpeed(), getSwimSpeed());
    }

    @Override
    public int getFlySpeed() {
        return 80;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
