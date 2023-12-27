package LocalDate_class;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Java LocalDate class is an immutable class that represents Date with a default format of yyyy-mm-dd.
public class LocalDateExample1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		// Find Current,yesterday,tomorrow Date
		System.out.println("Today is " + date);
		System.out.println("Yesterday is " + date.minusDays(1));
		System.out.println("Tomorrow is " + date.plusDays(1));

		// Find Current,pre&post Year
		System.out.println("Current Year is " + date);
		System.out.println("PreYear is " + date.minusYears(1));
		System.out.println("PostYear is " + date.plusYears(1));

		// Find Current,pre&post Week
		System.out.println("Current Week is " + date);
		System.out.println("PreWeek is " + date.minusWeeks(1));
		System.out.println("PostWeek is " + date.plusWeeks(1));

		// Find Current,pre&post Month
		System.out.println("Current Month is " + date);
		System.out.println("PreMonth is " + date.minusMonths(1));
		System.out.println("PostMonth is " + date.plusMonths(1));
		
		//find date,week,month,Year Separately
		System.out.println("Date is: "+date.getDayOfMonth());
		System.out.println("Month is :"+date.getMonth());
		System.out.println("Year is :"+date.getYear());
		
		//format the date by iso
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		//Find leap year
		LocalDate date2=LocalDate.of(2016,9,23);
		System.out.println(date2.isLeapYear());
		
		//Find date and time
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		//String to date conversion
		String d="1994-02-03";
		LocalDate date3=LocalDate.parse(d);
		System.out.println(date3);
		
		
	}

}
