package OOP.HW4.armor;

public class Steel implements Armor{
    @Override
    public int getDefence() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Steel: %d ", getDefence());
    }
}
