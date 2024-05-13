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

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        LocalDate nowDate = LocalDate.now();

        if (nowDate.isBefore(localDate)) {
            comingDday(localDate, nowDate);
        } else if (nowDate.isAfter(localDate)) {
            passDday(localDate, nowDate);
        } else if (nowDate.isEqual(localDate)) {
            System.out.println("D-DAY");
        }
    }

    //다가오는 디데이 기능
    private static void comingDday(LocalDate date, LocalDate nowDate) {
        LocalDate endDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        long daysBetween = ChronoUnit.DAYS.between(nowDate, endDate);
        System.out.println("D-" + daysBetween);
    }

    //시간이 흐른 디데이 기능
    private static void passDday(LocalDate date, LocalDate nowDate) {
        LocalDate startDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        long daysBetween = ChronoUnit.DAYS.between(startDate, nowDate);
        System.out.println("D+" + daysBetween);
    }
}
