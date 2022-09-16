package ua.lviv.lgs;

public class AirplaneControl implements Number {
	
	public static void up() {
		System.out.println("СУ-27 is moving up for " + Number.number() + " kilometers");
	}
	
	public static void down() {
		System.out.println("СУ-27 is moving down for " + Number.number() + " kilometers");
	}
	
	public static void right() {
		System.out.println("СУ-27 is moving right for " + Number.number() + " kilometers");
	}
	
	public static void left() {
		System.out.println("СУ-27 is moving left for " + Number.number() + " kilometers");
	}
	
	
}
