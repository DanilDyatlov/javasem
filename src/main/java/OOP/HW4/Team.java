package OOP.HW4;

import OOP.HW4.warriors.Archer;
import OOP.HW4.warriors.Warrior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        // так как у воина нет дистанции то мы проверяем на наличие лучника, если есть начинаем сравнивать
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

    public int getMinTeamDefence(){
        int minTeamDefence = Integer.MAX_VALUE;
        // Константа класса integer - MAX_VALUE, максимальное значение вмещающее в int
        for (T t : this) {
            int currentDefence = 0;
            if (t.getArmor() != null) {
                currentDefence = t.getArmor().getDefence();
            }
            if (currentDefence < minTeamDefence) {
                minTeamDefence = currentDefence;
            }
        }
        return minTeamDefence;
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