package OOP.sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;
    public Company(User user) {
        this.user = user;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> users = getTreeDeep(user);
            Iterator<User> iterator = users.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public User next() {
                return iterator.next();
            }
        };
    }

    public List<User> getTreeDeep(User user) {
        // Создаем дерево, и кладем людей все у кого есть кто то в подчинении
        List<User> users = new ArrayList<>();
        users.add(user); // Проверяем у user есть ли подчиненые, если да то идет в for
        if (user.getPersonal() == null) {
            return users;
        }
        for (User vassal:user.getPersonal()) {
            users.addAll(getTreeDeep(vassal));
            // для каждого vassal проверяем есть ли у него подчиненых. При этого накапливаем список из всех подчиненых,  добавляем
        }
        return users;
    }
}