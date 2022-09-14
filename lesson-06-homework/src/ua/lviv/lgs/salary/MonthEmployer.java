package ua.lviv.lgs.salary;

public class MonthEmployer implements Salary {
	private int monthsalary;

	@Override
	public void salary() {
		int monthsalary = 30000;
		System.out.println("Заробітня плата працівника з фіксованою зарплатою - " + monthsalary + " гривень в місяць");
	}	
	
}
