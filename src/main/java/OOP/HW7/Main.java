package OOP.HW7;

import OOP.HW7.actions.CalculationByMethods;
import OOP.HW7.client.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ViewCalculator viewCalculator = new ViewCalculator(CalculationByMethods::new);
        viewCalculator.start();
    }
}
