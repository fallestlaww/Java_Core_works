package ua.lviv.lgs;

public class CY27 extends Plane implements TurboAcceleration, StealthTechnology, Nuclear, Number3 {
	public CY27(int weight, int height, int length, int maxSpeed) {
		super(weight, height, length, maxSpeed);
	}
	
	@Override
	public void acceleration() {
		int turbo = (int) (maxSpeed + Math.random()*1000);
		System.out.println("Turbo is activated. Max speed of СУ-27 is " + turbo + " kilometers/hour.");
	}

	@Override
	public void stealth() {
		System.out.println("Stealth technology was activated. Time of invisibility of СУ-27 is " + Number.number() + " seconds.");
		
	}

	@Override
	public void nuclear() {
		System.out.println("Number of dropped nuclear warheads - " + Number3.number());
		
	}
}
