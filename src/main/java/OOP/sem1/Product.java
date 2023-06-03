package OOP.sem1;

public class Product {
    // Определяем название и цену продукта
    private String productName;
    private double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        // Инициализируем переменные
    }

    @Override
    public String toString() {
        return String.format("Продукт: %s, Цена: %f", productName, productPrice);
    }

    public String getProductName() {
        return productName;
    }
    // Сделали геттер так как сделали метод по поиску продуктов в вендинге

    public double getProductPrice() {
        return productPrice;
    }
}
