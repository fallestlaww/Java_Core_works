package homework;

import java.util.Objects;

public class Test {
	public String name;
	public int age;
	private String surname;
	private double weight;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, surname, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(surname, other.surname)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + ", surname=" + surname + ", weight=" + weight + "]";
	}
	public Test(String name, int age, String surname, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.surname = surname;
		this.weight = weight;
	}

	public void myMethod(String name) {
		this.name = name;
	}
	
	public void myMethod(int age) {
		this.age = age;
	}
}
