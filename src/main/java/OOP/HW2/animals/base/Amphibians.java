package OOP.HW2.animals.base;

import OOP.HW2.animals.base.Animals;
public abstract class Amphibians extends Animals {
    public Amphibians(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Amphibians: %s", super.toString());
    }
}
