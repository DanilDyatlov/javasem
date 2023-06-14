package OOP.HW3;


// Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
// Список должен содержать элементы со ссылкой на следующий элемент
// (если показалось мало, то реализовать ссылку и на предыдущий элемент)
public class Main {
    public static void main(String[] args) {
    LinkedUnit<String> linkedUnit = new LinkedUnit<>();
        linkedUnit.add("abc1");
        linkedUnit.add("abc2");
        linkedUnit.add("abc3");
        linkedUnit.add("abc4");
        linkedUnit.add("abdf2");

        System.out.printf("Размер цепи: %d\n", linkedUnit.size());

        System.out.println("Добавление элементов в цепь LinkedList");
        for(String valueUnit: linkedUnit){
            System.out.println(valueUnit);
        }



    }
}
