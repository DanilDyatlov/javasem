package OOP.HW7.actions;

import OOP.HW7.client.ComplexNumber;
import OOP.HW7.actions.Methods;
import OOP.HW7.actions.CalculationByMethods;

public class Calculator implements InterfaceCalculator{

    public Methods create(ComplexNumber arg) {
        return new CalculationByMethods(arg);
    }
}
