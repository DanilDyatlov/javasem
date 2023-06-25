package OOP.HW7.actions;

import OOP.HW7.client.ComplexNumber;

public interface Methods {
    // Интерфейс, в котором перечислены все действия, исполнимые калькулятором
    void sum(ComplexNumber number);
    void subtraction(ComplexNumber number);
    void multiplication(ComplexNumber number);
    void division(ComplexNumber number);

    ComplexNumber result();

}
