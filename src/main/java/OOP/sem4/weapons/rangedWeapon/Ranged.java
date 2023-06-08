package OOP.sem4.weapons.rangedWeapon;

import OOP.sem4.weapons.Weapon;

public interface Ranged extends Weapon {
    int distance();
    // К оружию подтянулось как дистанция так и дамаг так как методы наследуют друг друга
}