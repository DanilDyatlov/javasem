package OOP.HW2;

import OOP.HW2.animals.Frog;
import OOP.HW2.animals.Snake;
import OOP.HW2.terrarium.SwimSpeed;
import OOP.HW2.terrarium.Terrarium;
import OOP.HW2.animals.base.Animals;

public class Main {
    public static void main(String[] args) {
        Animals frog = new Frog("Петр");
        Animals snake = new Snake("Аркадий");
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimals(frog).addAnimals(snake);
        System.out.println(terrarium);

        System.out.println("Что говорят животные?: ");
        System.out.println(terrarium.getSound());

        System.out.println("--- Самый быстрый участник заплыва ---");
        SwimSpeed fastSwim = terrarium.fastSwimmers();
        System.out.println(fastSwim);
        System.out.println("--- Участники турнира ---");
        for (SwimSpeed swimmers: terrarium.swimmers()) {
            System.out.println(swimmers);
        }
    }
}
