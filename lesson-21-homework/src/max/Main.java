package max;

import java.util.Date;

public class Main {
public static void main(String[] args) {
	Date date = new Date();
	System.out.println(date);
	System.out.println(Transformation.fromdatetolocaldate(date));
	System.out.println(Transformation.fromdatetolocaltime(date));
	System.out.println(Transformation.fromdatetolocaldatetime(date));
}
}
