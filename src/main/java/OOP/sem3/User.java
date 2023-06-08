package OOP.sem3;

import java.util.List;

public class User implements Comparable<User> {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Personal personal;

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

        int firstNameCompareTo = this.firstName.compareTo(o.firstName);
        if (firstNameCompareTo != 0) {
            return firstNameCompareTo;
        }

        int lastNameCompareTo = this.lastName.compareTo(o.lastName);
        if (lastNameCompareTo != 0) {
            return lastNameCompareTo;
        }

        return this.age - o.age;

    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Personal getPersonal() {
        return personal;
    }
}
