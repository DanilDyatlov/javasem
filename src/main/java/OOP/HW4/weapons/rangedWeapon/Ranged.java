package OOP.HW4.weapons.rangedWeapon;

import OOP.HW4.weapons.Weapon;

public interface Ranged extends Weapon {
    int distance();
    // К оружию подтянулось как дистанция так и дамаг так как методы наследуют друг друга
}