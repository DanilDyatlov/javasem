package HW.HW5;
import java.util.*;
public class Book {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        // Задача 1. Реализуйте структуру телефонной книги с помощью HashMap,
        // учитывая, что 1 человек может иметь несколько телефонов.

//        Создаем список сотрудников
        String[] name = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        List<String> nameEmployee = new ArrayList<>();
        nameEmployee.addAll(Arrays.asList(name)); // добавляем всех людей в массив как список
        System.out.println("Список сотрудников компании: ");
        System.out.println(nameEmployee.toString()); // печатаем
        System.out.println();

        // создаем телефонный справочник.
        TellBook phoneBook = new TellBook();

        // добавляем номера телефонов сотрудников компании в справочник
        phoneBook.addNumber("Иван Иванов", "+79123789456");
        phoneBook.addNumber("Иван Иванов", "+79236754123");
        phoneBook.addNumber("Иван Иванов", "+799872673541");
        phoneBook.addNumber("Светлана Петрова", "+79852963741");
        phoneBook.addNumber("Кристина Белова", "+79147258369");
        phoneBook.addNumber("Кристина Белова", "+79753951852");
        phoneBook.addNumber("Анна Мусина", "+79753986241");
        phoneBook.addNumber("Анна Мусина", "+78888888888");
        phoneBook.addNumber("Анна Крутова", "+78999999999");
        phoneBook.addNumber("Иван Юрин", "+71777777777");
        phoneBook.addNumber("Петр Лыков", "+71111111111");
        phoneBook.addNumber("Павел Чернов", "+79222222222");
        phoneBook.addNumber("Петр Чернышов", "+78333333333");
        phoneBook.addNumber("Мария Федорова", "+77555555555");
        phoneBook.addNumber("Марина Светлова", "+78666666666");
        phoneBook.addNumber("Мария Савина", "+73777888999");
        phoneBook.addNumber("Мария Рыкова", "+79444444444");
        phoneBook.addNumber("Марина Лугова", "+72000000000");
        phoneBook.addNumber("Марина Лугова", "+72102301406");
        phoneBook.addNumber("Анна Владимирова", "+78025036014");
        phoneBook.addNumber("Иван Мечников", "+79708807908");
        phoneBook.addNumber("Петр Петин", "+76012320450");
        phoneBook.addNumber("Иван Ежов", "+77987456103");
        phoneBook.addNumber("Иван Ежов", "+790250520650");

        // Получаем номера телефонов всех сотрудников компании.
        for (int i = 0; i < nameEmployee.size(); i++) {
            String userName = nameEmployee.get(i); // по списку (i) получаем всех сотрудников из массива
            ArrayList<String> userNumbers = phoneBook.getNumbers(userName); // создаем лист и передаем в метод массив
            System.out.printf("Номера телефонов сотрудника  %s: ", userName);
            System.out.println(userNumbers);
        }
        System.out.println();

//        // Получение списка телефонных номеров определенного сотрудника, при необходимости.
//        System.out.printf("Номера телефонов сотрудника  %s: ", "Кристина Белова");
//        ArrayList<String> KristinaBelovaNumbers = phoneBook.getNumbers("Кристина Белова");
//        System.out.printf(KristinaBelovaNumbers.toString());
//        System.out.println();

//        // Удаление номера телефона определенного сотрудника.
//        // Например, удалим из телефонного справочника один из номеров сотрудника  - Кристина Белова.
//        phoneBook.removeNumber("Кристина Белова", "+79899182342");
//        System.out.println();
//        System.out.println("Получение оставшихся телефонных номеров сотрудника, после удаления некоторых номеров:");
//        KristinaBelovaNumbers = phoneBook.getNumbers("Кристина Белова");
//        System.out.printf("Номера телефонов сотрудника  %s: ", "Кристина Белова");
//        System.out.printf(KristinaBelovaNumbers.toString());
//        System.out.println();

    }
    // Это класс - телефонный справочник, который содержит все необходимые методы
    public static class TellBook {
        private Map<String, ArrayList<String>> book = new HashMap<>();

        public void addNumber(String name, String number) {
            // 1. метод для добавления в справочник телефонных номеров.
            if (book.containsKey(name)) { // из book проверяем содержится ли имена
                book.get(name).add(number); // получаем имена и добавляем туда номера
            } else {
                ArrayList<String> numbers = new ArrayList<>(); // если имени нет то добавляем номер и имя
                numbers.add(number);
                book.put(name, numbers);
            }
        }

        public ArrayList<String> getNumbers(String name) {
            // 2. метод для получения из справочника телефонных номеров.
            if (book.containsKey(name))
                return book.get(name);
            else
                return null;
        }

//        public void removeNumber(String name, String number) {
//            // 3. метод для удаления телефонных номеров, при необходимости.
//            if (book.containsKey(name)) {
//                ArrayList<String> numbers = book.get(name);
//                numbers.remove(number);
//                if (numbers.isEmpty())
//                    book.remove(name);
//            }
//        }
    }
}
