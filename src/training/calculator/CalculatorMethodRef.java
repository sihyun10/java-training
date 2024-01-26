package training.calculator;

import java.util.Scanner;

public class CalculatorMethodRef {
    public static void main(String[] args) {
        int result = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("| 1.계산기능 | 2.총 결과 | 3.초기화 | 4.종료 |");
            System.out.print("항목 선택: ");
            int choice = input.nextInt();
            input.nextLine();

            int num;

            if (choice == 1) {
                System.out.print("계산할 연산자를 입력해주세요: ");
                String operator = input.nextLine();

                switch (operator) {
                    case "+" -> {
                        System.out.print("계산할 숫자를 입력해주세요: ");
                        num = input.nextInt();
                        result = add(result, num);
                    }
                    case "-" -> {
                        System.out.print("계산할 숫자를 입력해주세요: ");
                        num = input.nextInt();
                        result = sub(result, num);
                    }
                    case "*" -> {
                        System.out.print("계산할 숫자를 입력해주세요: ");
                        num = input.nextInt();
                        result = mul(result, num);
                    }
                    default -> System.out.println("잘못된 연산자입니다. 다시 시도해주세요.");
                }
            } else if (choice == 2) {
                System.out.println("총 값의 결과는 " + result);
            } else if (choice == 3) {
                result = 0;
                System.out.println("값이 모두 초기화 되었습니다.");
            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("항목이 없는 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    public static int add(int result, int num) {
        result += num;
        System.out.println("숫자 " + num + "을 더하셨습니다. 현재 값의 결과는 " + result);
        return result;
    }

    public static int sub(int result, int num) {
        if (num < result) {
            result -= num;
            System.out.println("숫자 " + num + "을 빼셨습니다. 현재 값의 결과는 " + result);
        } else {
            System.out.println("현재 결과값이 음수입니다. 다시 시도해주세요.");
        }
        return result;
    }

    public static int mul(int result, int num) {
        result *= num;
        System.out.println("숫자 " + num + "을 곱하셨습니다. 현재 값의 결과는 " + result);
        return result;
    }
}
