package OOP.sem4.warriors;

import OOP.sem4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon> {
    // W это дженерик это Weapon
    private final String name;
    private int healthPoint;
    private W weapon;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
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

    public void setHealthPoint(int healthPoint) {
        // метод set устанавливает значение поля
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();

        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        // Метод по приниманию урона
        healthPoint -= damage;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d", name, weapon, healthPoint);
    }
}