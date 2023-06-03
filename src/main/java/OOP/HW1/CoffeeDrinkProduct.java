package OOP.HW1;

public class CoffeeDrinkProduct {
    private String name;
    private double volume;
    private double price;

    public CoffeeDrinkProduct(String name, double volume, double price){
        this.name = name;
        this.volume = volume;
        this.price = price;
        // Инициализировали переменные в классе.
    }
    /*
    Создаем методы для получения данных
    */
    public String getTypeName(){
        return name;
    }

    public double getVolume(){
        return volume;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString() {
        return String.format("Кофе: %s, Цена: %f, Объем: %f",  name, volume, price);
    /*Прописываем строку для вывода */
    }


}
