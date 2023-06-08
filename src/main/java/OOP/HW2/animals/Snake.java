package OOP.HW2.animals;

import OOP.HW2.animals.base.Reptiles;
import OOP.HW2.terrarium.Soundable;
import OOP.HW2.terrarium.SwimSpeed;

public class Snake extends Reptiles implements SwimSpeed, Soundable {
    public Snake(String name) {
        super(name);
    }
    @Override
    public String sound() {
        return "Hiss";
    }
    @Override
    public String feed() {
        return "frogs, fish";
    }
    @Override
    public int getSwimSpeed() {
        return 20;
    }
    @Override
    public String toString() {
        return String.format("Snake: %s, Sound: %s, SwimSpeed: %d", super.toString(), sound(), getSwimSpeed());
    }
}
