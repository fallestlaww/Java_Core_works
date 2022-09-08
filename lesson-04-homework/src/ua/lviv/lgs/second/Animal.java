package ua.lviv.lgs.second;

public class Animal {
	private String name;
	private String age;
	private String speed;
	
	
	public Animal(String name, String age, String speed) {
		super();
		this.name = name;
		this.age = age;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getSpeed() {
		return speed;
	}


	public void setSpeed(String speed) {
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", speed=" + speed + "]";
	}
	
}
