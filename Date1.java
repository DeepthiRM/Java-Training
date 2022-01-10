package Assignments;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Date1 {
    public static void main(String[] args) {
        dateDemo();
    }

    static void dateDemo(){
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
        System.out.println("Today: " + today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Today: " + today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Today: " + today.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));

        System.out.println("Tomorrow: " + today.plusDays(1));
        System.out.println("Yesterday: " + today.minusDays(1));
        System.out.println("Next week: " + today.plusWeeks(1));
        LocalDate sampleDate = LocalDate.parse("2012-10-01");
        System.out.println(sampleDate.getDayOfMonth() + " " + sampleDate.getMonth() + " "
                + sampleDate.getDayOfWeek() + " " + sampleDate.getYear());
        System.out.println(sampleDate.plus(1, ChronoUnit.MONTHS));
        System.out.println(sampleDate.minus(100, ChronoUnit.DAYS));
        System.out.println(sampleDate.minus(10, ChronoUnit.WEEKS));
        System.out.println(sampleDate.isAfter(today));
        System.out.println(sampleDate.isLeapYear());
    } 
}