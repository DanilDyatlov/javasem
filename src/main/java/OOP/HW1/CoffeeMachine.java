package OOP.HW1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<CoffeeDrinkProduct> drinksList = new ArrayList<>();
    private double cash = 0;

    public CoffeeMachine addDrinks(CoffeeDrinkProduct coffee){
        drinksList.add(coffee);
        return this;
        // Метод добавления продуктов. Drink - класс, drinksList - название списка
        // Из класса Drink подтягиваем данные и добавляем их к нашему списку
    }
    public CoffeeDrinkProduct findCoffeeProduct(String name){
        for (CoffeeDrinkProduct coffeeType : drinksList){
           // if (name.equals(coffeeType.getTypeName())){
           //    return coffeeType;
           //}
            if (coffeeType.getTypeName().equals(name)){
                return coffeeType;
            }
        }
        return null;
        // Метод поиска продукта в автомате. coffeeType переменная
    }

    public double getCash() {
        return cash;
        // Получение денег
    }

    public CoffeeDrinkProduct saleCoffee(String name){
        CoffeeDrinkProduct foundedAndSale = findCoffeeProduct(name);
        if(foundedAndSale != null) {
            cash = cash + foundedAndSale.getPrice();
            drinksList.remove(foundedAndSale);
        }
        return foundedAndSale;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        /*Показывает баланс и наличие кофе*/
        builder.append("Баланс: ").append(cash).append("\n");
        builder.append("Кофе в ассортименте: ").append(cash).append("\n");
        /*Перебор ассортимента*/
        for (CoffeeDrinkProduct coffeeType:drinksList){
            builder.append(coffeeType.toString()).append("\n");
        }
        return builder.toString();
    }
}
