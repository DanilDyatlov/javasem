package OOP.HW4.warriors;

import OOP.HW4.armor.Armor;
import OOP.HW4.weapons.Weapon;
import java.util.Random;

public abstract class Warrior<W extends Weapon, A extends Armor> {
    // W это дженерик это Weapon
    private final String name;
    private int healthPoint;
    private W weapon;
    private A armor;

    public Warrior(String name, int healthPoint, W weapon, A armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public W getWeapon() {
        return weapon;
    }
    public A getArmor(){
        return armor;
    }

    public void setHealthPoint(int healthPoint) {
        // метод set устанавливает значение поля
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public void setArmor(A armor){
        this.armor = armor;
    }

    public int hit() {
        Random rnd = new Random();
        return rnd.nextInt(0, weapon.damage() + 1);
        // +1, чтобы попасть в область
    }

    public void reduceHealth(int damage) {
        // Первоначальное значение защиты равно 0, в цикл иф если значения не равно нал, передаем метод защиты
        int defence = 0;
        if(armor != null ){
            defence = armor.getDefence();
        }
        // Метод по снижению входящего урона
        damage -= defence;
        if (damage < 0){
            damage = 0;
        }
        // Метод по получению урона
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }

    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d, Armor: %d", name, weapon, healthPoint, armor);
    }
}