package OOP.HW2.animals.base;

import OOP.HW2.animals.base.Animals;
public abstract class Reptiles extends Animals {
    public Reptiles(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return String.format("Reptiles: %s", super.toString());
    }
}