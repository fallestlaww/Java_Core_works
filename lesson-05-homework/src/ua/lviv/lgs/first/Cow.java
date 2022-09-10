package ua.lviv.lgs.first;

public class Cow extends Pet{
	public Cow(String name, String voice) {
		super(name, voice);
		this.setName("корова");
		this.setVoice("Мууу-Мууу");
	}
	@Override
	void voice() {
		System.out.println("Я " + name + " - " + voice);
	}

	
}
