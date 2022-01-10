package Assignments;
import java.time.LocalDate;


public class Date {
    public static void main(String[] args) {
        dateFormat();

    }



public static void dateFormat(){
    String day;
    String month;
    String year;
    System.out.println("ENTER THE DAY: ");
    day=System.console().readLine();

    System.out.println("ENTER THE MONTH: ");
    month=System.console().readLine();

    System.out.println("ENTER THE YEAR: ");
    year=System.console().readLine();
    LocalDate sampleDate=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
    System.out.println(sampleDate);
    for(int i=1;i<=Integer.parseInt(day);i++){
    LocalDate dateFrom=LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),i);


    System.out.println(dateFrom+" IS "+dateFrom.getDayOfWeek());
    }

}
} 