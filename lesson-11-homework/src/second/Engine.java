package second;

public class Engine {
	private int cylindernumbers;

	public int getCylindernumbers() {
		return cylindernumbers;
	}

	public void setCylindernumbers(int cylindernumbers) {
		this.cylindernumbers = cylindernumbers;
	}

	@Override
	public String toString() {
		return "кількісь циліндрів: " + cylindernumbers + "";
	}

	public Engine(int cylindernumbers) {
		super();
		this.cylindernumbers = cylindernumbers;
	}
	
	
}
