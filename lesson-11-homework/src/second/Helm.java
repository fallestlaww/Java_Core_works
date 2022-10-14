package second;

public class Helm {
	private int wheeldiametr;
	
	public int getWheeldiametr() {
		return wheeldiametr;
	}
	public void setWheeldiametr(int wheeldiametr) {
		this.wheeldiametr = wheeldiametr;
	}
	@Override
	public String toString() {
		return "діаметр колеса: " + wheeldiametr + " сантиметрів";
	}
	public Helm(int wheeldiametr) {
		super();
		this.wheeldiametr = wheeldiametr;
	}
	
	
}
