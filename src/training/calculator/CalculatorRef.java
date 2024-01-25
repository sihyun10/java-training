package training.calculator;

import java.util.Scanner;

public class CalculatorRef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("계산할 연산자를 입력해주세요 (\"종료\"를 입력하면 종료됨): ");
            String operator = input.nextLine();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")) {
                System.out.print("계산할 첫 번째 숫자를 입력해주세요: ");
                int num1 = input.nextInt();
                System.out.print("계산할 두 번째 숫자를 입력해주세요: ");
                int num2 = input.nextInt();

                input.nextLine(); //이전에 입력된 개행문자 제거

                switch (operator) {
                    case "+" :
                        System.out.println("값의 결과: " + (num1 + num2));
                        break;
                    case "-" :
                        System.out.println("값의 결과: " + (num1 - num2));
                        break;
                    case "*" :
                        System.out.println("값의 결과: " + (num1 * num2));
                        break;
                    case "/" :
                        double divide = (double) num1 / num2;
                        System.out.println("값의 결과: " + divide);
                        break;
                    case "%" :
                        System.out.println("값의 결과: " + (num1 % num2));
                        break;
                }
            } else if (operator.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
            }
        }
    }
}
