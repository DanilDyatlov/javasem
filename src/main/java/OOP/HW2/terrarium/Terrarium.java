package OOP.HW2.terrarium;
import OOP.HW2.animals.base.Animals;
import OOP.HW2.terrarium.SwimSpeed;

import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animals> terrarium = new ArrayList<>();

    public Terrarium addAnimals(Animals terraAmimals){
        terrarium.add(terraAmimals);
        return this;
    }

    private List<Soundable> getSoundable() {
//        List<Soundable> soundables = new ArrayList<>(terrarium);
//        return soundables;
        List<Soundable> soundables = new ArrayList<>();
        for (Animals animal : terrarium) {
            if (animal instanceof Soundable) {
                soundables.add((Soundable) animal);
            }
        }
        return soundables;
    }

    public String getSound() {
        StringBuilder builder = new StringBuilder();
        for (Soundable soundAnimal: getSoundable()) {
            builder.append(soundAnimal.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmersAnimals = new ArrayList<>();
        for (Animals animals : terrarium) {
            if (animals instanceof SwimSpeed){
                swimmersAnimals.add((SwimSpeed) animals);
            }
        }
        return swimmersAnimals;
    }
    public SwimSpeed fastSwimmers(){
        List<SwimSpeed> swimmers = swimmers();
        SwimSpeed fastSwim = swimmers.get(0);
        for (SwimSpeed animals : swimmers) {
            if (fastSwim.getSwimSpeed() < animals.getSwimSpeed()){
                fastSwim = animals;
            }
        }
        return fastSwim;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Обратите внимание кто живет в нашем террариуме!: \n");
        for (Animals animal: terrarium) {
            builder.append(animal).append("\n");
        }
        return builder.toString();
    }
}
