package minimum;

public class Employee {
	@Statistic("Nice to meet you!")
	private String name;
	@Statistic("You look older")
	private int age;
	@Statistic("What a hight salary!")
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Ім'я" + name + " вік" + age + ", зарплата" + salary + "]";
	}
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
