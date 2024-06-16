package training.dateTime;

import training.dateTime.exception.DateFormatException;
import training.dateTime.exception.IncludeOptionException;

import java.util.Scanner;

import static training.dateTime.DateCalculator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DdayCalculatorService dayService = new DdayCalculatorService();

        while (true) {
            try {
                System.out.print("설정하고자 하는 날짜를 입력해주세요[2024.05.14]: ");
                String date = scanner.nextLine();
                dayService.validateDate(date);

                System.out.print("설정 날짜를 1일로 포함하겠습니까?[네/아니오]: ");
                String include = scanner.nextLine();
                dayService.validateIncludeOption(include);

                calculateDday(date, include);
                break;
            } catch (DateFormatException | IncludeOptionException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
