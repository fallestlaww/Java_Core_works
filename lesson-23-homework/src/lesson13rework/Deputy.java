package lesson13rework;

import java.util.Scanner;

public class Deputy{
	private String name;
	private String surname;
	private int age;
	private boolean bribetaker;
	private int bribesize;
	
	public Deputy(String name, String surname, boolean bribetaker) {
		this.name = name;
		this.surname = surname;
		this.bribetaker = bribetaker;
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

	public int getBribesize() {
		return bribesize;
	}

	public void setBribesize(int bribesize) {
		this.bribesize = bribesize;
	}

	@Override
	public String toString() {
		return "Deputy [name=" + name + ", surname=" + surname + ", age=" + age + ", bribetaker=" + bribetaker
				+ ", bribesize=" + bribesize + "]";
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
}
