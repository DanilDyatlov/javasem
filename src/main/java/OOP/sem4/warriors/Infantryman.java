package OOP.sem4.warriors;

import OOP.sem4.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee>{
    // Warrior<Melee> уточнение, пешотинец может взять только оружеее в методе melee

    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
