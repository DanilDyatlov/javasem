package OOP.HW7.client;

import java.util.Scanner;

public class Input {
    protected String prompt(String massage){
        Scanner scanner = new Scanner(System.in);
        System.out.println(massage);
        return scanner.nextLine().toLowerCase();
    }
}
