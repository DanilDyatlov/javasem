package OOP.sem1;

public class Cheese extends Product{
    private String cheeseType;
    private double weight;
    // отличительные черты для продукта

    public Cheese(String productName, double productPrice, String cheeseType, double weight) {
        super(productName, productPrice);
        this.cheeseType = cheeseType;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Cыр: %s, Тип: %s, Вес: %f", super.toString(), cheeseType, weight);
        // используем этот метод для форматирования вывода в мейне.
        // super  это обращение к родительскому классу обращение
    }
}