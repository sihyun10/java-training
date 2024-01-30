package training.calculator;

public class CalculatorOop {
    private int currentValue; //현재값
    private boolean powerOn; //전원버튼

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
        checkPowerStatus();
        currentValue += calculateValue;
        System.out.println(currentValue);
    }

    void subtract(int calculateValue) {
        checkPowerStatus();
        currentValue -= calculateValue;
        System.out.println(currentValue);
    }

    void multiply(int calculateValue) {
        checkPowerStatus();
        currentValue *= calculateValue;
        System.out.println(currentValue);
    }

    //현재값 출력기능
    void currentValuePrint() {
        checkPowerStatus();
        System.out.println("총 계산 결과는: " + currentValue);
    }

    private void checkPowerStatus() {
        if (!powerOn) {
            throw new RuntimeException("전원이 꺼져있습니다. 계산을 할 수 없습니다.");
        }
    }
}
