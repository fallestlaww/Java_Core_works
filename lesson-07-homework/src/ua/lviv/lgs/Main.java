package ua.lviv.lgs;

public class Main {
	public static void main(String[] args) {
	CY27 cy27 = new CY27(100,100,100,400);
	
	cy27.EngineStart();
	cy27.Takeoff();
	cy27.up();
	cy27.left();
	cy27.down();
	cy27.right();
	cy27.stealth();
	cy27.nuclear();
	cy27.acceleration();
	cy27.Boarding();
	}
}
