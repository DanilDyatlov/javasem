package OOP.HW1;

public class Main {
    public static void main(String[] args) {
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    coffeeMachine.addDrinks(new HotDrinkType("Эспрессо", 0.4, 100, 80))
                    .addDrinks(new HotDrinkType("Американо", 0.5, 90, 75))
                    .addDrinks(new HotDrinkType("Капучино", 0.3, 140, 60))
                    .addDrinks(new HotDrinkType("Латте", 0.3, 135, 60))
                    .addDrinks(new HotDrinkType("Раф", 0.3, 150, 70));

        System.out.println("Добро пожаловать! Готовы сделать заказ? Мы можем вам предложить: ");
        System.out.println(coffeeMachine);

        System.out.println("Подготовка напитка...");
        System.out.println(coffeeMachine.saleCoffee("Эспрессо"));

        System.out.println("Добро пожаловать! Готовы сделать заказ? Мы можем вам предложить: ");
        System.out.println(coffeeMachine);
    }
}
