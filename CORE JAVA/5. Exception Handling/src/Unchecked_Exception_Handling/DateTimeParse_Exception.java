package Unchecked_Exception_Handling;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateTimeParse_Exception {

	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			String d="03-02-03";
			LocalDate date3=LocalDate.parse(d);
			System.out.println(date3);
		} catch (DateTimeParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program Ended");

	}

}
