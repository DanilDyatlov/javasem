package OOP.sem2.animals;

import OOP.sem2.RunSpeed;
import OOP.sem2.animals.base.Herbivores;

public class Cow extends Herbivores implements RunSpeed {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Moo";
    }

    @Override
    public String toString() {
        return String.format("Cow: %s, Speed: %d", super.toString(), getRunSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 3;
        // Создали метод по скорости
    }
}
