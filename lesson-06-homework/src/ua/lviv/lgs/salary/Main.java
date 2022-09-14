package ua.lviv.lgs.salary;

public class Main {

	public static void main(String[] args) {
		MonthEmployer month = new MonthEmployer();
		month.salary();
		HoursEmployer hours = new HoursEmployer();
		hours.salary();
	}

}
