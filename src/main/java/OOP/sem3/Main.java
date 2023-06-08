package OOP.sem3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Ivanov", 25))
                .addUser(new User("Petr", "Ivanov", 23))
                .addUser(new User("Ivan", "Sidorov", 45))
                .addUser(new User("Ivan", "Ivanov", 21))
                .addUser(new User("Petr", "Sidorov", 35))
                .addUser(new User("Nikolay", "Sidorov", 36));

        for (User user:personal) {
            System.out.println(user);
        }

        List<User> users = personal.getUsers();
        System.out.println("__________");
        Collections.sort(users);

        for (User user:personal) {
            System.out.println(user);
        }
        User bigBoss = new User("Dmitriy", "Petrovich", 40);
        bigBoss.setPersonal(personal);
        User littleBoss = new User("Oleg", "Petrovich", 35);
        personal.addUser(littleBoss);
        littleBoss.setPersonal(new Personal().addUser(new User("Nikolay", "Petrov", 35)));


        System.out.println("=============");
        Company company = new Company(bigBoss);


        User middleBoss = new User("Mike", "Petrovich", 25);
        personal.addUser(middleBoss);
        middleBoss.setPersonal(new Personal().addUser(new User("Ivan", "Popov", 20))
                .addUser(new User("Nikolay", "Popov", 20)));

        for (User user:company) {
            System.out.println(user);
        }
    }
}