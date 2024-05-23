package training.dateTime;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class KakaoDday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("설정하고자 하는 날짜를 입력해주세요[2024.05.14]: ");
                String date = scanner.nextLine();
                System.out.print("설정 날짜를 1일로 포함하겠습니까?[네/아니오]: ");
                String include = scanner.nextLine();

                if (!include.equals("네") && !include.equals("아니오")) {
                    throw new IllegalArgumentException("[ERROR] '네' 또는 '아니오'로 입력해주세요.");
                }

                DateCalculator.calculateDday(date, include);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("[ERROR] 올바른 날짜형식으로 입력해주세요.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
