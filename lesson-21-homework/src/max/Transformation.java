package max;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Transformation {
	public static LocalDate fromdatetolocaldate(java.util.Date date) {
		LocalDate localdate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localdate;
	}
	
	public static LocalTime fromdatetolocaltime(java.util.Date date) {
		LocalTime localtime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		return localtime;
	}
	
	public static LocalDateTime fromdatetolocaldatetime(java.util.Date inputDate) {
		LocalDateTime localdatetime = inputDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		return localdatetime;
	}
}
