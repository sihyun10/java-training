package training.calculator;

public class CalculatorOop {
    int currentValue; //현재값
    boolean powerOn; //전원상태 (켜짐/꺼짐)

    //전원 켜기,끄기 기능
    void turnOn() {
        powerOn = true;
        System.out.println("전원이 켜졌습니다.");
    }

    void turnOff() {
        powerOn = false;
        System.out.println("전원이 꺼졌습니다.");
    }

    //계산기능
    void add(int calculateValue) {
        currentValue += calculateValue;
        System.out.println(currentValue);
    }

    void subtract(int calculateValue) {
        currentValue -= calculateValue;
        System.out.println(currentValue);
    }

    void multiply(int calculateValue) {
        currentValue *= calculateValue;
        System.out.println(currentValue);
    }

    //현재값 출력기능
    void currentValuePrint() {
        System.out.println("총 계산 결과는: " + currentValue);
    }
}
