import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Month;


public class CreandoDates{

	public static void main(String args[]){
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());


		LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
		LocalDate date2 = LocalDate.of(2020, 10, 20);
		System.out.println(date1);
		System.out.println(date2);

		LocalTime time1 = LocalTime.of(6,15); //hora y minuto
		LocalTime time2 = 
			LocalTime.of(6,15,30); //hora, minuto y segundos
		System.out.println(time1);
		System.out.println(time2);

		LocalDateTime ldt1 = 
			LocalDateTime.of(2020, Month.OCTOBER, 20, 6,15,30);
		System.out.println(ldt1);
	}

}