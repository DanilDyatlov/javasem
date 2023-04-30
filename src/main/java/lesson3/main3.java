package lesson3;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class main3 {
    private static StringBuilder sb;

    public static void main(String[] args){
        //task1();
        task2();
        task3();

    }

    private static void task3() {
//  Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Neptune", "Uranus", "Pluto"};

        Random random = new Random();
        List<String> randomSolarSistems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            randomSolarSistems.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        for (int i = 0; i <randomSolarSistems.size() ; i++) {
            if (randomSolarSistems.contains(planetsNamesStringArray[i])) {
                randomSolarSistems.remove(planetsNamesStringArray[i]);
            }
        }    
    }
        

    private static void task2() {
//  Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//  Вывести название каждой планеты и количество его повторений в списке.
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
                                            "Saturn", "Neptune", "Uranus", "Pluto"};

        Random random = new Random();
        List<String> randomSolarSistems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            randomSolarSistems.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }

        randomSolarSistems.sort(Comparator.naturalOrder());
//       // нахождение индекса первого вхождения в списке
//        System.out.println(randomSolarSistems);
//        int venus = randomSolarSistems.indexOf("Venus");
//        System.out.println(venus);
//        int uranus = randomSolarSistems.indexOf("Uranus");
//        System.out.println(uranus);
//        int mercury = randomSolarSistems.indexOf("Mercury");
//        System.out.println(mercury);

        int count = 0;
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            count = 0;
            for (var item: randomSolarSistems){
//            for (int j = 0; j < randomSolarSistems; j++) {
                if (item.equals(planetsNamesStringArray[i]));
                    count++;
            }
        sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");
        }
        System.out.println(sb);
    }

    private static void task1() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        list.sort(Comparator.reverseOrder());
//        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
    }
}
