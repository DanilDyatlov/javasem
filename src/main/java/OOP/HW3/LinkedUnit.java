package OOP.HW3;

import java.util.Iterator;

public class LinkedUnit<E> implements Iterable<E> {
    private int size = 0;
    private Item<E> first;
    private Item<E> last;

    public void add(E value){ // добавление элемента
        Item<E> newUnite = new Item<>(null,null, value);
        // строка ссылается на public Item(Item<E> previous, Item<E> next, E element)
        // value значение которое мы кладем в метод
        if (first == null){ // если первое значение равно null, то к первому присваиваем newUnite
            first = newUnite;
        } else {
            last.next = newUnite;
            newUnite.previous = last;
            // Если смотреть от последнего элемента. Следующий после него (last) будет наше новая единица(newUnite)
            // а значит последний элемент (last), будет предпоследний (previous) от новой единицы (newUnite)
        }
        // при дальнейшем добавлении единиц в коллекцию, размер увеличивается
        last = newUnite;
        size++;
    }
    public int size(){
        return size;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>(){
            Item<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }
    private static class Item<E> {
        // Класс для определения типа данных
        private Item<E> previous; // возвращает предыдущий элемент
        private Item<E> next; // возвращает следующий элемент
        private E element; // то что мы будем класть в это значение

        public Item(Item<E> previous, Item<E> next, E element){
            this.previous = previous;
            this.next = next;
            this.element = element;
        }

    }
}

