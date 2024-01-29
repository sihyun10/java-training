package training.calculator;

public class CalculatorOopMain {
    public static void main(String[] args) {
        CalculatorOop calculator = new CalculatorOop();

        calculator.turnOn();

        calculator.add(200);
        calculator.subtract(100);
        calculator.multiply(3);
        calculator.currentValuePrint();

        calculator.turnOff();
    }
}
