package OOP.HW7.actions;

import OOP.HW7.client.ComplexNumber;
public class CalculationByMethods implements Methods {

    private final ComplexNumber complexNumber;
    public CalculationByMethods(ComplexNumber complexNumber){
        this.complexNumber = complexNumber;
    }

    @Override
    public void sum(ComplexNumber number){
        int a = complexNumber.getA() + number.getA();
        int b = complexNumber.getB() + number.getB();
        complexNumber.setA(a);
        complexNumber.setB(b);
    }
    @Override
    public void subtraction(ComplexNumber number){
        int a = complexNumber.getA() - number.getA();
        int b = complexNumber.getB() - number.getB();
        complexNumber.setA(a);
        complexNumber.setB(b);
    }
    @Override
    public void multiplication(ComplexNumber number){
        int a = complexNumber.getA() * number.getA() - complexNumber.getB() * number.getB();
        int b = complexNumber.getB() * number.getA() + complexNumber.getA() * number.getB();
        complexNumber.setA(a);
        complexNumber.setB(b);
}
    @Override
   public void division(ComplexNumber number){
        int a = (complexNumber.getA() * number.getA() + complexNumber.getB() * number.getB()) / (number.getA() * number.getA() + number.getB() * number.getB());
        int b = (complexNumber.getB() * number.getA() - complexNumber.getA() * number.getB()) / (number.getA() * number.getA() + number.getB() * number.getB());
        complexNumber.setA(a);
        complexNumber.setB(b);
    }
    @Override
    public ComplexNumber result(){
        return complexNumber;
    }

}
