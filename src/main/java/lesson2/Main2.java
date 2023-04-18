package lesson2;
import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }




    private static void task1() {
// Дано число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
        Scanner cs = new Scanner(System.in);
        System.out.print("Input amount of chars: ");
        int amountOfChar = cs.nextInt();

        String[] c= new String[] {"A","b"};

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < amountOfChar; i++) {
            result.append(c[i % 2]);
        }
        System.out.println(result);

//        char a = 'A';
//        char b = 'b';
//        int n = 5;
//        String str = "" + a + b;
//        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");
//
//        System.out.println(str);

    }
    private static void task2() {
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
        String trash = "aaaabbbcddYYYYYoooooo00000";
        StringBuilder result = new StringBuilder();

        int counter = 1;

        for (int i = 0; i < trash.length() - 1 ; i++) {
            if ( trash.charAt(i + 1) != trash.charAt(i)) {
                result.append(trash.charAt(i));
                if (counter != 1) {
                    result.append(counter);
                }
                counter = 0;
            }
            counter++;
        }
        result.append((trash.charAt(trash.length() - 1))).append(counter);
        System.out.println(result);
    }
    private static void task3() {
    }
}
