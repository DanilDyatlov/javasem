package OOP.sem2.zoo;

import OOP.sem2.FlySpeed;
import OOP.sem2.Radio;
import OOP.sem2.RunSpeed;
import OOP.sem2.SwimSpeed;
import OOP.sem2.animals.base.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final Radio radio = new Radio();
    private final List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
        /*
        Метод добавления животных Animal это класс someAnimal это параметр. Т.е. из класса мы добавляем все переменные в список
        */
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В зоопарке:\n");
        for (Animal animal: zoo) {
            // Добавляем животных animal из зоопарка zoo
            builder.append(animal)
                    .append('\n');
            // При выводе строки сразу будет надпись в зоопарке
        }
        return builder.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>(zoo);
        // В создании нового листа передаем уже существующий
        result.add(radio);
        return result;
        // Метод, который будет возвращать список всех классов, которые могут делать звуки
        // Ко всем звукам мы добавили звук радио
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSoundable()) {
            // Для каждого soundable из getSoundable
            builder.append(soundable.sound()).append('\n');
        }
        return builder.toString();
    }

    public List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof RunSpeed) {
                runners.add((RunSpeed) animal); // Приведение типа. animal мы привели к RunSpeed
                // instanceof проверяет относиться ли animal к RunSpeed
            }
        }
        return runners;
        // Метод по получению списка бегунов.
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners(); // Вызываем параметр
        RunSpeed champ = runners.get(0); // берем нулевой элемент как первоначальный
        for (RunSpeed runner: runners) { // Проходимся по бегунам. Передаем из runners в runner и сравниваем
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
        // Метод для возращения чемпиона
    }

    public List<FlySpeed> flyers() {
        List<FlySpeed> flyers = new ArrayList<>();// Создали список летунов
        for (Animal animal: zoo) { // Цикл по животным и добавляем из зоопарка
            if (animal instanceof FlySpeed) { // Если animal часть FlySpeed, то добавляем к flyers
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }

    public List<SwimSpeed> swimmers() {
        List<SwimSpeed> swimmer = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof SwimSpeed) {
                swimmer.add((SwimSpeed) animal);
            }
        }
        return swimmer;
    }

    public SwimSpeed getSwimmerChampion(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed champ = swimmers.get(0);
        for (SwimSpeed runner: swimmers) {
            if (champ.getSwimSpeed() < runner.getSwimSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

    public FlySpeed getFlyerChampion(){
        List<FlySpeed> flyers = flyers();
        FlySpeed champ = flyers.get(0);
        for (FlySpeed runner: flyers) {
            if (champ.getFlySpeed() < runner.getFlySpeed()) {
                champ = runner;
            }
        }
        return champ;
    }

}
