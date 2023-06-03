package OOP.sem1;

public class Chocolate extends Product {
    // extends говорит о том что класс Chocolate принадлежит Product
    private String chocColor;
    private String chocType;
    private int chocCalories;
    // перечисляем его особенности
    // privat нужен чтобы никто из вне не мог изменить код

    public Chocolate(String productName, double productPrice, String chocColor, String chocType, int chocCalories) {
        // добавляем в паблик его индивидуальные особености
        // создали конструктор
        super(productName, productPrice);
        this.chocColor = chocColor;
        this.chocType = chocType;
        this.chocCalories = chocCalories;
    }

    @Override
    // создаем форматированную строку
    public String toString() {
        return String.format("Шоколад: %s, Цвет: %s, Вкус: %s, Калории: %d", super.toString(), chocColor, chocType, chocCalories);
        // с помощью super.toString() вызываем данные из класса Product. После форматирования строки в методе идем в мейн
    }
}