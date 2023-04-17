package HW;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class HW1 {
    public static void main(String[] args) {
        // task1();
        // task2();
        task3();
    }

    private static int[] task1() {
// 1. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len,
//    каждая ячейка которого равна initialValue;
    Scanner input = new Scanner (System.in);
    System.out.println("Введите длинну массива: ");
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
//  2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int[] array2 = {10,2,1,4,5};
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
        Scanner input = new Scanner (System.in);
        System.out.println("Введите размер двумерного массива: ");
        int n = input.nextInt();
        int[][] array3 = new int[n][n];
        Random random = new Random();
        int upperBound = 10;
        IntStream.range(0, n).forEach(index -> array3[index][index] = random.nextInt(upperBound));
        System.out.print(Arrays.toString(array3));
    }
}
