package HW.HW6;
import java.util.*;
public class Notebook {
    String brand;
    String model;
    int ramGb;
    String storageType;
    int storageGb;
    String color;
    int price;

        public Notebook(String brand, String model, int ramGb, String storageType, int storageGb, String color, int price) {
            this.brand = brand;
            this.model = model;
            this.ramGb = ramGb;
            this.storageType = storageType;
            this.storageGb = storageGb;
            this.color = color;
            this.price = price;
            // this указывает на один и тот же элемент который вводится в Netbook class и просто в Netbook()
        }
    @Override
    // Переопределение позволяет взять какой-то метод родительского класса и написать в каждом классе-наследнике свою
    // реализацию этого метода.
    // Новая реализация «заменит» родительскую в дочернем классе. Сообщили компилятору,
    // что мы не просто так назвали метод так же, как в классе-родителе: хотим переопределить его поведение.
    // Для этого «сообщения» компилятору мы поставили над методом аннотацию @Override («переопределен»).
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramGb=" + ramGb +
                ", storageType='" + storageType + '\'' +
                ", storageCapacityGb=" + storageGb +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ramGb, storageType, storageGb, color, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Notebook notebook = (Notebook) obj;
        return ramGb == notebook.ramGb && storageGb == notebook.storageGb &&
                price == notebook.price && Objects.equals(brand, notebook.brand) &&
                Objects.equals(model, notebook.model) && Objects.equals(storageType, notebook.storageType) &&
                Objects.equals(color, notebook.color);
    }
}


