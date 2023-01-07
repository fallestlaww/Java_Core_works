package cinema;

public class Time {
	int minute;
	int hour;
	public Time(int hour, int minute) throws Exception {
		super();
		this.minute = minute;
		this.hour = hour;
		if(minute < 0 || minute > 60) {
			throw new Exception("Ви ввели некоректну хвилину");
		}
		
		if(hour < 0|| hour > 24) {
			throw new Exception("Ви ввели некоректну годину");
		}
	}

	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	@Override
	public String toString() {
		return "" + hour + " години " + minute + " хвилин";
	}
	
	public static Time sumTime(Time time1, Time time2) throws Exception {
		int hour = time1.getHour() + time2.getHour();
		int minute = time1.getMinute() + time2.getMinute();
		if (minute >= 60) {
			hour = hour + 1;
			minute = minute - 60;
		} else if (hour >= 24) {
			hour = hour - 24;
		}
		return new Time(hour, minute);
	}
	
}	                                                                 