package HW;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.IntSummaryStatistics;


public class HW1 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }
    public static int[] task1() {
// 1. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len,
//    каждая ячейка которого равна initialValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = input.nextInt();
        int array1[] = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Введите элементы массива: ");
            int initialValue = input.nextInt();
            array1[i] = initialValue;
        }
        System.out.println(Arrays.toString(array1));
        return array1;
    }

    private static void task2() {
//  2. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        int[] array2 = {10, 2, 1, 4, 5};
        IntSummaryStatistics stats = Arrays.stream(array2).summaryStatistics();

        System.out.println("Min element is: " + stats.getMin());
        System.out.println("Max element is: " + stats.getMax());

//        // Второй метод через сортировку
//        int[] array2 = {10,2,1,4,5};
//        Arrays.sort(array2);
//        System.out.println("Min element is " + array2[0]);
//        System.out.println("Max element is " + array2[array2.length - 1]);
    }

    private static void task3() {
// 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер двумерного массива: ");
        int n = input.nextInt();
        int[][] array3 = new int[n][n];

        // Метод 1
//        IntStream.range(0, n).forEach(i -> {array3[i][i] = 1; array3[i][array3.length - 1 - i] = 1;
//        });
//        Arrays.stream(array3).map(Arrays::toString).forEach(System.out::println);

//      Метод 2 через for и рандом
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array3[i][j] = rnd.nextInt(2);
            }
        }
        // Делает '1' по диагонали
        for (int i = 0; i < n; i++) {
            array3[i][i] = 1;
        }
//        System.out.println(Arrays.deepToString(array3));

        // Метод 3 обычный
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                array3[i][j] = 0;
//                if (array3[i] == array3[j]) {
//                    array3[i][j] = 1;
//                } else {
//                    array3[i][j] = 0;
//                }
//            }
//        }

        // делает двумерный массив без скобок
        for (
                int[] a : array3) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
    }

    private static void task4() {
//   4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//   "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//   "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//   "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//   "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        Scanner scanner = new Scanner(System.in);
        System.out.print("Привет, как тебя зовут?: ");
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if ((hour > 5) && (hour < 12)){
            System.out.printf("Доброе утро, %s!", name);
        }
        if ((hour > 12) && (hour < 18)){
            System.out.printf("Добрый день, %s!", name);
        }
        if ((hour > 18) && (hour < 23)){
            System.out.printf("Добрый вечер, %s!", name);
        }
        if ((hour > 24) && (hour < 5)){
            System.out.printf("Доброй ночи, %s!", name);
        }
        System.out.println();

    }
}