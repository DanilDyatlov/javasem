package OOP.sem2;
import OOP.sem2.animals.Duck;
import OOP.sem2.animals.Owl;
import OOP.sem2.animals.base.Animal;
import OOP.sem2.animals.Bear;
import OOP.sem2.animals.Cow;
import OOP.sem2.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Мурка");
        // Создаем животных

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald")).addAnimal(new Owl("Сава"));
        // наполняем наш зоопарк медведем и коровой
        System.out.println(zoo);

        System.out.println(zoo.getSound());
        // Выводим звуки


        RunSpeed champ = zoo.getRunnerChampion(); // Получаем чемпионов. Вызываем метод
        System.out.println("--Runnner-champion--");
        System.out.println(champ);
        System.out.println("---runners---");
        for (RunSpeed runner: zoo.runners()) {
            System.out.println(runner);
        }

        System.out.println("--flyers--");
        for (FlySpeed flyer: zoo.flyers()) {
            System.out.println(flyer);
        }

        System.out.println("--swimmers--");
        for (SwimSpeed swimmer: zoo.swimmers()) {
            System.out.println(swimmer);
        }

        System.out.println("--Swimmer-champion--");
        System.out.println(zoo.getSwimmerChampion());

        System.out.println("--Flyer-champion--");
        System.out.println(zoo.getFlyerChampion());

    }
}
