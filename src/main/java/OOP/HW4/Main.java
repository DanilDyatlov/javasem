package OOP.HW4;

import OOP.HW4.armor.Leather;
import OOP.HW4.armor.Steel;
import OOP.HW4.warriors.Archer;
import OOP.HW4.warriors.Infantryman;
import OOP.HW4.warriors.Warrior;
import OOP.HW4.weapons.meleeWeapon.Axe;
import OOP.HW4.weapons.meleeWeapon.Sword;
import OOP.HW4.weapons.rangedWeapon.Bow;
import OOP.HW4.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Leather()));
        team1.add(new Infantryman("John", 150,new Axe(), new Steel()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(), new Leather()));
        teamArchers.add(new Archer("Piter",100, new Bow(), new Leather()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(),new Steel()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe(), new Steel()), (new Archer("Robin", 100, new Bow(), new Leather())));

        battle1.fight();

    }
}