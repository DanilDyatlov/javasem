package OOP.sem4;

import OOP.sem4.warriors.Archer;
import OOP.sem4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Team<T extends Warrior> implements Iterable<T> {
    // <T> дженерик, метка которая показывает что метод использует дженерик(обобщение)
    // Т.е. в список нельзя внести кроме строк внести цифры
    private List<T> team = new ArrayList<>();

    public void add(T element) {
        team.add(element);
    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T t : this) {
            teamHealth += t.getHealthPoint();
        }
        return teamHealth;
    }

    public int maxAttackDistance() {
        // так как у война нет дистанции то мы проверяем на наличие лучника, если есть начинаем сравнивать
        int maxDistance = 0;
        for (T t : this) {
            if (!(t instanceof Archer)) {
                continue;
            }
            int currentDistance = ((Archer) t).distance();
            if (maxDistance < currentDistance) {
                maxDistance = currentDistance;
            }
        }
        return maxDistance;
    }

    public int getTeamAttack() {
        int teamAttack = 0;
        for (T t : this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : this) {
            builder.append(t).append('\n');
        }
        builder.append(String.format("TeamAttack: %d ", getTeamAttack()));
        builder.append(String.format("TeamHealth: %d ", getTeamHealth()));
        builder.append(String.format("TeamRange: %d ", maxAttackDistance()));
        return builder.toString();
    }
}