package OOP.sem1;


import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> vending = new ArrayList<>(); // Создаем список в который помещаем product
    private double cash = 0;

    public VendingMachine addProduct(Product prod){ // Создаем метод в качестве параментра кладем Product и имя параметра prod
        // Возвращает VendingMachine т.е. самого себя
        vending.add(prod);
        return this;
        // если прописать this то в маине можно просто работать с командой addProduct. Если возврата этого метода не ьбудет
        // то нужно будет в меине прописывать код
        // Метод, который добавляем в vending продукты
    }

    public List<Product> getVending() {
        return vending;
        // сделали геттер на методе, чтобы могли вывести то что написали в мейне.
    }

    // Метод по поиску продукта. Возвращаем класс продуктов и название метода
    public Product findProduct(String name){
        for (Product product:vending) { // Идем по продуктам  из нашего списка вендинг
            if (name.equals(product.getProductName())){ // название продукта содержащийся в параметре product с методом получения продукта
                return product;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    } // сделали геттер

    public Product saleProduct(String nameProd){
        // метод по продаже товара. К значению founded присваиваем метод по нахождению
        Product founded = findProduct(nameProd);
        if (founded != null){
            cash = cash + founded.getProductPrice(); // при продаже увеличиваем на имя метода+поиск цены
            vending.remove(founded); // после покупки удаляем продукт
        }
        return founded;
    }

    @Override
    public String toString() {
        // с помощью этого метода упрощаем код в мейне. Через билдер показываем сколько денег осталось
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Product product:vending) {
            builder.append(product).append("\n");
            // с помощью фор показываем что осталось в автомате
        }
        return builder.toString();
    }
}
