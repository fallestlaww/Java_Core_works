package homework;

import java.util.Scanner;

public class Deputy extends People{
	private String name;
	String surname;
	private int age;
	boolean bribetaker;
	int bribesize;

	public int getBribesize() {
		return bribesize;
	}

	public void setBribesize(int bribesize) {
		this.bribesize = bribesize;
	}

	public void givebribe() {
		if(bribetaker == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введіть суму хабару, яку хочете дати: ");
			int bribesize = scanner.nextInt();
			if(bribesize >= 5000) {
				System.out.println("Поліція заарештує хабарника");
			}else if(bribesize < 5000) {
				System.out.println("Хабар відданий успішно");
			}
		}if(bribetaker == false){
			System.out.println("Депутат не бере хабарів");
		}
 	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribetaker() {
		return bribetaker;
	}

	public void setBribetaker(boolean bribetaker) {
		this.bribetaker = bribetaker;
	}

	

	public Deputy(double weight, double height, String name,  String surname, int age, boolean bribetaker) {
		super(weight, height);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bribetaker = bribetaker;
	}

	@Override
	public String toString() {
		return "Інформація про депутата: " + "Ім'я: " + name + ", прізвище: " + surname + ", вік: " + age + ". Хабарник? " + bribetaker ;
	}


}
