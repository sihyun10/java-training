package training.dateTime;

import java.util.Scanner;

public class KakaoDday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("설정하고자 하는 날짜를 입력해주세요[2024.05.14]: ");
        String date = scanner.nextLine();
        System.out.print("설정 날짜를 1일로 포함하겠습니까?[네/아니오]: ");
        String include = scanner.nextLine();

        DateCalculator.calculateDday(date, include);
    }
}
