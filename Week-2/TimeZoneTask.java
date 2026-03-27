import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeZoneTask {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("India: " +
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).format(format));
        System.out.println("USA: " +
                ZonedDateTime.now(ZoneId.of("America/New_York")).format(format));
        System.out.println("London: " +
                ZonedDateTime.now(ZoneId.of("Europe/London")).format(format));
    }
}
