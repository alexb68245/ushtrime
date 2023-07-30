import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class SDADate {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        LocalDate nextDate = LocalDate.of(2023, 8, 5);

        Period difference = Period.between(dateNow, nextDate);
        System.out.println(difference.getDays());
    }
}
