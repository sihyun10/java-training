package training.dateTime;

import training.dateTime.exception.DateFormatException;
import training.dateTime.exception.IncludeOptionException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DdayCalculatorService {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public void validateDate(String date) throws DateFormatException {
        try {
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new DateFormatException("[ERROR] 올바른 날짜형식으로 입력해주세요.");
        }
    }

    public void validateIncludeOption(String include) throws IncludeOptionException {
        if (!include.equals("네") && !include.equals("아니오")) {
            throw new IncludeOptionException("[ERROR] '네' 또는 '아니오'로 입력해주세요.");
        }
    }
}
