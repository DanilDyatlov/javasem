package OOP.HW4.weapons.meleeWeapon;

public class Sword implements Melee {
    @Override
    public int damage() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Sword: %d ", damage());
    }
}
