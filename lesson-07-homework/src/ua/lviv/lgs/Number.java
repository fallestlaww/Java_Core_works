package ua.lviv.lgs;

public interface Number {
		static int number() {
		int number = (int) (Math.random()*1000);
		return number;
	}
}
