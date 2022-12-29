package first;

public class Application {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.cat.voice();
		Dog dog = new Dog();
		dog.dog.voice();
		Cow cow = new Cow();
		cow.cow.voice();
	}

}

interface Pet {
	void voice();
}

class Cow {
	Pet cow = () -> System.out.println("Я корова- Мууу-Мууу");
}

class Dog {
	Pet dog = () -> System.out.println("Я пес - Гаууу-Гаууу");
}

class Cat {
	Pet cat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
}