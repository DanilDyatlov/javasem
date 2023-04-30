package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Comparator;

public class HW3 {
    public static void main(String[] args){
        //task1();
        //task2();
        task3();
    }

    private static boolean task1() {
// 1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
// Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}

// Метод get возвращает значение, присутствующее в указанном индексе
// try – определяет блок кода, в котором может произойти исключение;
// catch – определяет блок кода, в котором происходит обработка исключения;
// retainAll удаляет элементы коллекции которыех нет в переданной, вывод [11, 13, 17]
// removeAll удаляет те элементы из нашей коллекции, которые содержатся в другой переданной коллекции вывод [Яблоко, Апельсин, Дыня]

        ArrayList<String> itemsList = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(itemsList);
        ArrayList<String> numDel = new ArrayList<>();
//         Метод 1 Удаление. Возвращает [Яблоко, 13, Апельсин, Дыня]
//        for (int i = 0; i < itemsList.size(); i++) {
//            String stringElem = itemsList.get(i);
//            try {
//                Integer.parseInt(stringElem);
//                itemsList.remove(stringElem);
//            } catch (Exception e) {
//            }
//        }
//        System.out.println(itemsList);
//        return false;

        // Метод 2 Добавление. Возвращает [Яблоко, Апельсин, Дыня]
        for (int i = 0; i < itemsList.size(); i++) {
            String stringElem = itemsList.get(i);
            try {
                Integer.parseInt(stringElem);
                numDel.add(stringElem);
            } catch (Exception e) {
            }
        }
        itemsList.removeAll(numDel);
        System.out.println(itemsList);
        return false;
    }

    private static void task2() {
// 2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
// что на 0й позиции каждого внутреннего списка содержится название жанра,
// а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
// Пример:
// "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
// "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
// "Детектив", "Десять негритят".
// "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
        Scanner scanner = new Scanner(System.in);
        List<ArrayList<String>> books = new ArrayList<>(); // общий список жанров с их книгами

        System.out.println("Введите количество жанров, которые хотите добавить к выбранному списку книг: ");
        int quantityGenres = Integer.parseInt(scanner.nextLine()); // преобразование строки в число

        for (int i = 0; i < quantityGenres; i++) {
            // используем первый for  для того чтобы мы могли добавить несколько жанров к списку

            System.out.println("Введите жанр книги: ");
            String genresInput = scanner.nextLine();

            ArrayList<String> genresList = new ArrayList<>(); // создаем список жанров и в него добавляем введеные жанры
            genresList.add(genresInput);

            System.out.println("Введите количество книг, которые хотите добавить к выбранному жанру: ");
            int quantityBooks = Integer.parseInt(scanner.nextLine()); // преобразование строки в число

            for (int j = 0; j < quantityBooks; j++) {
                // используем втрой for для добавления несколько книг к одному жанру
                System.out.println("Введите название книги: ");
                String nameBooks = scanner.nextLine();
                genresList.add(nameBooks); // введеные книги добавляем к жанру
            }
            books.add(genresList); // введеные жанры добавляем к общему списку книг
        }
//        System.out.println(books); // обычный вывод в одну сроку
//        books.forEach(System.out::println);
        books.forEach((n) -> System.out.println(n));
        // Метод forEach() в ArrayList используется для выполнения определенной
        // операции для каждого элемента в ArrayList. Этот метод обходит каждый элемент итерации
        // ArrayList до тех пор, пока все элементы не будут обработаны методом или не возникнет исключение.

    }

    private static void task3() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        System.out.println("Исходный список с повторениями:");
        System.out.println(list);
        list.sort(Comparator.naturalOrder()); // Natural Ordering сортировка по алфавиту а числа по возрастанию.
        // Comparator сравнение
        for (int i = 0; i < list.size() - 1; i++) {
            String first = list.get(i);
            String second = list.get(i + 1);
            if (second.equals(first)) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Итоговый список:");
        System.out.println(list);




    }



}
