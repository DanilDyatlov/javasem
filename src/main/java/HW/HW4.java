package HW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    private static void task1() {
//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("""
                Команды для ввода:
                'print' - для вывода;
                'revert' - для удаления последней введённой строки;
                'exit' - для выхода.""");
        System.out.println();

        while (true) {
            System.out.println("Введите команду или строку: ");
            String input = scanner.nextLine();
            // остановка кода с помощью break
            if (input.equalsIgnoreCase("exit")) {
                break;

                // если длина введенной строки равняется нулю или просто нажали enter, то выдаст такое сообщение
            } else if (input.trim().length() == 0) {
                System.out.println("Строка не должна быть пустой");

                // Идем с конца цикла. i = последнему значению в списке и идем на убывание
            } else if (input.equalsIgnoreCase("print")) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    System.out.println(list.get(i));
                }

                // Удаляет последний написанную строку
            } else if (input.equalsIgnoreCase("revert")) {
                System.out.println("Удалён элемент - " + list.removeLast());

                // Если написанный элемент не равна 0, то она добавляется к общему списку
            } else {
                if (input.trim().length() != 0) {
                    list.add(input);
                    System.out.println("Добавлен элемент - " + input);
                }
            }
        }
    }

    private static void task2() {
//2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        LinkedList<String> list = new LinkedList<>(Arrays.asList("Один", "Два", "Три", "Четыре","Пять"));
        LinkedList<String> list = new LinkedList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");

        // Метод 1
//        Iterator<String> iterator = list.descendingIterator();
// hasNext() показывает доступен ли предыдущий элемент
// next() с итератором по убыванию вернет предыдущий элемент и после получения предыдущего элемента
// перемещается к следующему предыдущему элементу.
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

        // Метод 2
// функция hasPrevious() для проверки предыдущего элемент на присутствие
// получаем предыдущий элемент и после получения перемещаемся к следующему предыдущему элементу
//        ListIterator<String> listIterator = list.listIterator(list.size());
//        while (listIterator.hasPrevious())
//        {
//            System.out.println(listIterator.previous());
//        }

        // Метод 3
        System.out.println("Измененный вид:");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) != null) {
                System.out.printf("%d. %s%n", i + 1, list.get(i));
            }
        }

        System.out.println();

        System.out.println("Исходный вид:");
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) != null) {
                System.out.printf("%d. %s%n", j + 1, list.get(j));
            }
        }
    }
}