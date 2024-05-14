package training.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateCalculator {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private static final LocalDate nowDate = LocalDate.now();

    public static void calculateDday(String date, String include) {
        LocalDate setDate = LocalDate.parse(date, formatter);

        if (nowDate.isBefore(setDate)) {
            comingDday(setDate);
        } else if (nowDate.isAfter(setDate)) {
            passDday(setDate, include);
        } else if (nowDate.isEqual(setDate)) {
            nowDday(setDate, include);
        }
    }

    private static void comingDday(LocalDate setDate) {
        long daysBetween = ChronoUnit.DAYS.between(DateCalculator.nowDate, setDate);
        System.out.println("D-" + daysBetween);
    }

    private static void passDday(LocalDate setDate, String include) {
        long daysBetween = 0;
        if (include.equals("네")) {
            daysBetween = ChronoUnit.DAYS.between(setDate, DateCalculator.nowDate) + 1;
        } else if (include.equals("아니오")) {
            daysBetween = ChronoUnit.DAYS.between(setDate, DateCalculator.nowDate);
        }

        System.out.println("D+" + daysBetween);
    }

    private static void nowDday(LocalDate setDate, String include) {
        if (include.equals("네")) {
            long daysBetween = ChronoUnit.DAYS.between(setDate, DateCalculator.nowDate) + 1;
            System.out.println("D+" + daysBetween);
        } else {
            System.out.println("D-DAY");
        }
    }
}
