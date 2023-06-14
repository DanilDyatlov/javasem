package OOP.HW4.warriors;

import OOP.HW4.armor.Armor;
import OOP.HW4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Armor> {
    public Archer(String name, int healthPoint, Ranged weapon, Armor armor) {
        // Warrior<Ranged> уточнение, пехотинец может взять только оружие в методе range
        super(name, healthPoint, weapon, armor);
    }
    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}