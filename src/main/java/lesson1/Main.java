package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ex1();
        ex2();
        ex3();
    }

    public static void ex3() {
        int[] arr = {3, 2, 2, 3, 5, 6, 6, 7};
        int val = 3;
        int temp = 0;
        int indexEnd = arr.length - 1;
        int indexStart = 0;

        for (int i = 0; indexStart < indexEnd; i++) {
            if (arr[indexStart] != val) {
                indexStart++;
            } else if (arr[indexEnd] == val) {
                indexEnd--;
            } else {
                temp = arr[indexEnd];
                arr[indexEnd] = arr[indexStart];

                arr[indexStart] = temp;
                indexStart++;
                indexEnd--;
            }

       for (int num : arr) {
            System.out.println(num);
       }
        }
//        System.out.println(Arrays.toString(arr));
    }
//    int[] arr = {3, 2, 2, 3, 5, 6, 6, 7};
//    int val = 3;
//    int temp = 0;
//    int indexEnd = arr.length - 1;
//    int indexStart = 0;
//    for (int i = 0; indexStart < indexEnd; i++) {
//        if (arr[i] != val){
//            indexStart += 1;
//        }
//        else if (arr[i] == val) {
//            if (arr[indexEnd] != val) {
//                temp = arr[indexEnd];
//                arr[indexEnd] = arr[indexStart];
//                arr[indexStart] = temp;
//                indexStart += 1;
//                indexEnd -= 1;
//            } else {
//                indexEnd -= 1;
//            }
//        }
//    }
//    for (int num : arr) {
//        System.out.println(num);
//    }
//}
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
            for (int num : arr) {
//                перебор массива с помощью :
                if (num == 1) {
                    count += 1;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }
            System.out.println(max);
        }
}

