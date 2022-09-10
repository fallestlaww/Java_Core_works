package ua.lviv.lgs.first;

public class Cat extends Pet{

	public Cat(String name, String voice) {
		super(name, voice);
		this.name = "кіт";
		this.voice = "Мяууу-Мяууу";
	}

	@Override
	void voice() {
		System.out.println("Я " + name + " - " + voice);
	}

}
