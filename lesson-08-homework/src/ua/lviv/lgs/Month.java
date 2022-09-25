package ua.lviv.lgs;

public enum Month {
	
	January(Seasons.WINTER, 31),
	February(Seasons.WINTER, 28),
	March(Seasons.SPRING, 31),
	April(Seasons.SPRING, 30),
	May(Seasons.SPRING, 31),
	June(Seasons.SUMMER, 30),
	July(Seasons.SUMMER, 31),
	August(Seasons.SUMMER, 31),
	September(Seasons.AUTUMN, 30),
	October(Seasons.AUTUMN, 31),
	November(Seasons.AUTUMN, 30),
	December(Seasons.WINTER, 31);
	
		Seasons s;
		int day;

		Month(Seasons s, int day) {
			this.s = s;
			this.day = day;
		}

		public Seasons getS() {
			return s;
		}

		public void setS(Seasons s) {
			this.s = s;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}
		
		
}

