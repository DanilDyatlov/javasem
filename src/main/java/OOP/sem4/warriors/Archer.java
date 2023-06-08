package OOP.sem4.warriors;

import OOP.sem4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        // Warrior<Melee> уточнение, пешотинец может взять только оружеее в методе range
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}