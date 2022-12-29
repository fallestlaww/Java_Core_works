package third;

public class Application {

	public static void main(String[] args) {
		Frog frog = new Frog();
		frog.eat.work();
		frog.sleep.work();
		frog.swim.work();
		frog.walk.work();
	}

}

interface Amphibia {
	void work();
}

class Frog {
	Amphibia eat = () -> System.out.println("I want to eat");
	Amphibia sleep = () -> System.out.println("I want to sleep");
	Amphibia swim = () -> System.out.println("I want to swim");
	Amphibia walk = () -> System.out.println("I want to walk");
}