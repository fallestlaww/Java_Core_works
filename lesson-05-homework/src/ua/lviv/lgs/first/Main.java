package ua.lviv.lgs.first;

public class Main {
	public static void main(String[] args) {
		Cow cow = new Cow("test", "test");
		Cat cat = new Cat("test", "test");
		Dog dog = new Dog("test", "test");
		cow.voice(); 
		cat.voice();
		dog.voice();
	}
}
