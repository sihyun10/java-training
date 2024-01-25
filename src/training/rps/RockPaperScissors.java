package training.rps;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("가위,바위,보 중에 입력해주세요 (\"종료\"를 입력하면 종료됨): ");
            String rps = input.nextLine();

            if (rps.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (rps.equals("가위") || rps.equals("바위") || rps.equals("보")) {
                System.out.println("당신이 낸 것은 " + rps + "입니다.");
                continue;
            }

            System.out.println("잘못된 입력입니다. 다시 올바르게 입력해주세요.");
        }
    }
}
