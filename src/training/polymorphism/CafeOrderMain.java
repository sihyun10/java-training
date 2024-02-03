package training.polymorphism;

import java.util.Scanner;

public class CafeOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();

        while (true) {
            System.out.print("어떤 음료를 만들까요?");
            String drink = scanner.nextLine();
            if (drink.equals("종료")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }

            worker.made(drink);
        }
    }
}
