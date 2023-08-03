import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class FormateandoDates{

	public static void main(String args[]){
		LocalDate date = LocalDate.of(2022, Month.JUNE, 27);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());

		LocalTime time = LocalTime.of(11,12,34);

		LocalDateTime dt = LocalDateTime.of(date,time);
		System.out.println("---- format -----");
		System.out.println(
			date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(
			time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(
			dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println("---- personalizado -----");
		
		var f = DateTimeFormatter.ofPattern("MM dd, yy 'at' hh:mm");
		System.out.println(dt.format(f));

	}

}






