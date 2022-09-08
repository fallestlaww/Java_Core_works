package ua.lviv.lgs.second;

public class Main {
	public static void main(String[] args) {
		Animal s = new Animal ("Леопард", "7 років", "20 км/год");
		System.out.println("Назва тварини = " + s.getName() + ", Швидкість тварини = " + s.getSpeed() + ", Вік тварини = " + s.getAge());
		
		s.setName("Бик");
		s.setAge("14 років");
		s.setSpeed("2 км/год");
		System.out.println("Назва тварини = " + s.getName() + ", Швидкість тварини = " + s.getSpeed() + ", Вік тварини = " + s.getAge());
	}
}
