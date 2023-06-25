package OOP.HW7.actions;

import OOP.HW7.client.ComplexNumber;

public class Calculator implements InterfaceCalculator{

    public CalculationByMethods create(ComplexNumber arg) {
        return new CalculationByMethods(arg);
    }
}
