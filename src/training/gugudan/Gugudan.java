package training.gugudan;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("출력할 구구단의 단을 입력해주세요 (-1을 입력하면 종료됨): ");
            int n = input.nextInt();

            if (n == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println(n + "단을 출력합니다:");

            for (int i = 1; i <= 10; i++) {
                int result = n * i;
                System.out.println(n + " x " + i + " = " + result);
            }
        }
    }
}
