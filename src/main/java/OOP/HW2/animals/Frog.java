package OOP.HW2.animals;

import OOP.HW2.terrarium.Soundable;
import OOP.HW2.terrarium.SwimSpeed;
import OOP.HW2.animals.base.Amphibians;


public class Frog extends Amphibians implements SwimSpeed, Soundable {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "ribbit";
    }

    @Override
    public String feed() {
        return "insects";
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Frog: %s, Sound: %s, SwimSpeed: %d", super.toString(), sound(), getSwimSpeed());
    }
}
