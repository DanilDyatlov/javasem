package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ex1();
        ex2();
        ex3();
    }

    private static void ex3() {
        //Дан массив nums = [3,2,2,3] и число val = 3.
        //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        //а остальные - равны ему.
        int[] arr = new int[]{3, 2, 2, 3};
        int val = 3;
        list
    }
        public static void ex1 () {
            System.out.println("Введите имя:");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println("Привет, " + str);
        }

        public static void ex2 () {
            // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
            int[] arr = new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0};
            int count = 0;
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num == 1) {
                    count += 1;
                    if (count > max) {
                        max = count;
                    }
                } else if (num != 1) {
                    count = 0;
                }
            }
            System.out.println(max);
        }
}

