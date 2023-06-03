package OOP.HW1;

public class HotDrinkType extends CoffeeDrinkProduct {
    private int temperature;

    public HotDrinkType(String name, double volume, double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
        // Определили переменные, super это ссылка на коревые классы. Определили температуру.
    }

    @Override
    public String toString() {
        return String.format("%s, Температура: %d °C", super.toString(),  temperature);
        // добавили к основной строке с помощью super.toString()показатель температуры
    }
}
