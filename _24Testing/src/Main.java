import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //ottieni l'anno
        System.out.println("YEAR: " + obtainYear(date));

        //ottieni il mese
        System.out.println("MONTH: " + obtainMonth(date));

        //ottieni il giorno
        System.out.println("DAY: " + obtainDay(date));

        //ottieni il giorno della settimana
        System.out.println("DAY of the WEEK: " + obtainDayOfTheWeek(date));


    }

    public static String obtainDayOfTheWeek(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.getDayOfWeek().name();
        }
    }

    public static Integer obtainDay(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.getDayOfMonth();
        }
    }

    public static String obtainMonth(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return String.valueOf(date.getMonth());
        }
    }

    public static Integer obtainYear(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.getYear();
        }
    }
}