package OOP.HW7.client;

import OOP.HW7.actions.CalculationByMethods;
import OOP.HW7.actions.InterfaceCalculator;
import OOP.HW7.actions.Methods;

import java.util.Scanner;

public class ViewCalculator{
    private Scanner scanner = new Scanner(System.in);
    private InterfaceCalculator interfaceCalculator;
    public ViewCalculator(InterfaceCalculator interfaceCalculator){
        this.interfaceCalculator = interfaceCalculator;
    }

    public void start() {
        Methods methodsCalculate = interfaceCalculator.create(getNumbers());
        while (true) {
            System.out.println("Введите символ от одной из следующих операций: " +
                    "sum(+), subtraction(-), multiplication(*), division(/)" +
                    "Чтобы посчитать ответ введите символ: '=' ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    methodsCalculate.sum(getNumbers());
                    break;
                case "-":
                    methodsCalculate.subtraction(getNumbers());
                    break;
                case "*":
                    methodsCalculate.multiplication(getNumbers());
                    break;
                case "/":
                    methodsCalculate.division(getNumbers());
                    break;
                case "=":
                    System.out.println("Результат вычислений: " + methodsCalculate.result());
                    break;
            }
        }
    }

    // Метод matches() – в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению.
    private ComplexNumber getNumbers() {
        System.out.println("Введите комплексное число: ");
        String inputNumber = scanner.nextLine();

        // Преобразуем комплексное число
        // Комплексное число имеет вид z = a+bi
        String[] numberStr = inputNumber.split("\\+"); // разделяем строку на часть А и часть В + i
        String a = numberStr[0];
        String b = numberStr[1].split("[i]")[0];
        ComplexNumber complexNumber = new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));

        while(!inputNumber.matches("^[\\d]+\\+[\\d]+[i]$")){
            // Если число не равно z = a+bi, то выдаст ошибку и попросит ввести заново комплексное число
            System.out.print("Неправильный ввод. Комплексное число имеет вид 'a+bi', пожалуйста попробуйте снова: ");
            inputNumber = scanner.nextLine();
        }
        return complexNumber;
    }
}
