package ua.lviv.lgs.salary;

public class HoursEmployer implements Salary {
	private int hoursalary;
	private int monthsalary;

	@Override
	public void salary() {
		int hoursalary = 120;
		int monthsalary = hoursalary * 240;
		System.out.println("Заробітня плата працівника з погодинною оплатою - "+ monthsalary + " гривень в місяць");
	}

}
