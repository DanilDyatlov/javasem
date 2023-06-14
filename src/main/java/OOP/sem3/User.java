package OOP.sem3;

import java.util.List;

public class User implements Comparable<User> {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Personal personal; // подчиненые

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("firstName: %s, lastName: %s, age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        // если текущий объект меньше тот объект который в параметре (User o), то дает отрицательное число, если равны то 0
        // работает со списками

        int firstNameCompareTo = this.firstName.compareTo(o.firstName);
        if (firstNameCompareTo != 0) {
            return firstNameCompareTo;

        }


        int lastNameCompareTo = this.lastName.compareTo(o.lastName);
        if (lastNameCompareTo != 0) {
            return lastNameCompareTo;
        }
// Метод сравнения. Сначала сравниваем фамилию с нулем, если не равно возвращаем
        // compareTo возвращает положительное или ноль(отрицательное число). Сравнивает по строчно, если первый условие сопадает то возвращает вторую строчку
        return this.age - o.age;

    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }
}
