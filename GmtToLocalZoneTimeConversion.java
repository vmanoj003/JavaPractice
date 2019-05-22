import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GmtToLocalZoneTimeConversion {

    private static final String DATE_FORMAT = "dd-MM-yyyy'T'kk:mm:ss";

    public static void main(String[] args) throws ParseException {


       // SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

//         String dateInString = "22-01-2015T10:15:55";

//         LocalDateTime ldt = LocalDateTime.parse(dateInString, formatter.ofPattern(DATE_FORMAT));

//         ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
//         System.out.println("TimeZone : " + singaporeZoneId);

//         ZonedDateTime asiaZonedDateTime = ldt.atZone(singaporeZoneId);
//         System.out.println("Date (Singapore) : " + asiaZonedDateTime);

//         System.out.println("\n---DateTimeFormatter---");
//         System.out.println("Date (Singapore) : " + formatter.format(asiaZonedDateTime));
        
        
        String str = "2019-02-23T22:00:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'kk:mm:ss");
        LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
        ZonedDateTime dateAndTimeInUTC = ZonedDateTime.of(localtDateAndTime,ZoneOffset.UTC);

        System.out.println("date and time in UTC timezone : " + dateAndTimeInUTC);

        ZoneId newyork = ZoneId.of("Asia/Calcutta");

        ZonedDateTime estDate = dateAndTimeInUTC.withZoneSameInstant(newyork);

        System.out.println("Current date and time in EST : " + estDate);
        System.out.println("Formatted Date and time" + formatter.format(estDate));




    }
}
