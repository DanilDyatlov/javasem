package OOP.HW4.armor;

public class Leather implements Armor {
    @Override
    public int getDefence() {
        return 3;
    }
    @Override
    public String toString() {
        return String.format("Leather: %d ", getDefence());
    }
}
