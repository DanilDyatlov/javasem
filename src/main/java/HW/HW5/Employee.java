package HW.HW5;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
//      Создаем список сотрудников
        String[] nameEm = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        List<String> nameEmployee = new ArrayList<>();
        nameEmployee.addAll(Arrays.asList(nameEm)); // добавляем всех людей в массив как список
        System.out.println("Список сотрудников компании: ");
        System.out.println(nameEmployee.toString()); // печатаем
        System.out.println();

//      HashMap в которую в качестве ключа заношу фамилию сотрудника, в качестве значения имя сотрудника.
        Map<String, String> employee = new HashMap<>(); // Значения в виде строки
        for (int i = 0; i < nameEmployee.size(); i++) {
            String temp = nameEmployee.get(i); // получение из массива данные
            String[] name = temp.split(" "); // разделяем строку, делитель это пробел
            employee.put(name[1], name[0]); // заношу значения в переменную
        }

        // Получаю список только имен сотрудников, без их фамилий
        List<String> firstNameEmployee = new ArrayList<>();
        for (int i = 0; i < employee.size(); i++) {
            String temp = nameEmployee.get(i);
            String[] names = temp.split(" ");
            String key = names[1];
            String name = employee.get(key);
            firstNameEmployee.add(name);
        }
        System.out.println("Список имен сотрудников без фамилий:");
        System.out.println(firstNameEmployee.toString());
        System.out.println();

        // Сортирую полученный список.
        firstNameEmployee.sort(Comparator.naturalOrder());

        // Получаю список уникальных имен у сотрудников компании.
        Set<String> names = new HashSet<>(firstNameEmployee);
        List<String> firstNames = new ArrayList<>(names);
        firstNames.sort(Comparator.naturalOrder());

        // Нахожу индекс первого вхождения каждого уникального имени в общем списке имен,
        // и записываю его в список индексов.
        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < firstNames.size(); i++) {
            int indexName = firstNameEmployee.indexOf(firstNames.get(i));
            counts.add(indexName);
        }
        counts.add(firstNameEmployee.size());

        // Создаю HashMap в которую в качестве ключа записываю уникальные имена сотрудников,
        // а в качестве значений - количество повторений данного имени.
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < firstNames.size(); i++) {
            String name = firstNames.get(i);
            int num = counts.get(i + 1) - counts.get(i);
            map.put(name, num);
        }

        // Вывожу HashMap с количеством повторений уникальных имен на печать, согласно условию задачи.
        System.out.println("Количество повторений имен сотрудников, отсортированное по убыванию популярности:");
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
