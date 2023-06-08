package OOP.sem2.animals;

import OOP.sem2.RunSpeed;
import OOP.sem2.SwimSpeed;
import OOP.sem2.animals.base.Predator;

public class Bear extends Predator implements RunSpeed, SwimSpeed {
    public Bear(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Rear";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }

    @Override
    public int getSwimSpeed() {
        return 6;
    }
}
