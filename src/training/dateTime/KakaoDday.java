package training.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class KakaoDday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("설정하고자 하는 날짜를 입력해주세요[2024.05.14]: ");
        String date = scanner.nextLine();
        System.out.print("설정 날짜를 1일로 포함하겠습니까?[네/아니오]: ");
        String include = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate setDate = LocalDate.parse(date, formatter);
        LocalDate nowDate = LocalDate.now();

        if (nowDate.isBefore(setDate)) {
            comingDday(setDate, nowDate);
        } else if (nowDate.isAfter(setDate)) {
            passDday(setDate, nowDate, include);
        } else if (nowDate.isEqual(setDate)) {
            nowDday(setDate, include);
        }
    }

    //다가오는 디데이 기능
    private static void comingDday(LocalDate setDate, LocalDate nowDate) {
        long daysBetween = ChronoUnit.DAYS.between(nowDate, setDate);
        System.out.println("D-" + daysBetween);
    }

    //시간이 흐른 디데이 기능
    private static void passDday(LocalDate setDate, LocalDate nowDate, String include) {
        long daysBetween = 0;
        if (include.equals("네")) {
            daysBetween = ChronoUnit.DAYS.between(setDate, nowDate) + 1;
        } else if (include.equals("아니오")) {
            daysBetween = ChronoUnit.DAYS.between(setDate, nowDate);
        }

        System.out.println("D+" + daysBetween);
    }

    private static void nowDday(LocalDate setDate, String include) {
        if (include.equals("네")) {
            System.out.println("D+1");
        } else {
            System.out.println("D-DAY");
        }
    }
}
