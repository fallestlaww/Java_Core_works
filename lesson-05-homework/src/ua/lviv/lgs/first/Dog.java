package ua.lviv.lgs.first;

public class Dog extends Pet{

	public Dog(String name, String voice) {
		super(name, voice);
		this.name = "пес";
		this.voice = "Гаууу-Гаууу";
	}

	@Override
	void voice() {
		System.out.println("Я " + name + " - " + voice);
	}

}
