package OOP.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Personal implements Iterable<User>{
    // Класс сделали итеррированным с помощью Iterable. Класс итерируем по пользователям <User>
    // НУжно для того чтобы с помощью фор ич то класс персонал будет возвращать пользователей
    private List<User> users = new ArrayList<>();
    @Override
    public Iterator<User> iterator() {
        // iterator. Когда запускается фор ич то джава запускает итерирования
        return new PersonalIterator();
    }

    public Personal addUser(User user){
        users.add(user);
        return this;
        // если тут будет использоваться void вместо personal, то в мейн нужно будет прописывать больше при добавлении
        // Метод возвращает самого себя
    }

    public List<User> getUsers() {
        return users;
    }
    private class PersonalIterator implements Iterator<User> {
        int index = 0; // индекс

        @Override
        public boolean hasNext() {
            // Возвращает значение есть ли следующий элемент в списке относительно текущего. если есть то запускается метод некст
            return index < users.size(); // до конца списка
        }

        @Override
        public User next() {
            // Возвращает следующий элемент. Возвращает текущий и переходит к следующему
            return users.get(index++);
        }
    }

}
