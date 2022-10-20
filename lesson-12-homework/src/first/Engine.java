package first;

public class Engine {
	private int cylindres;

	public int getCylindres() {
		return cylindres;
	}

	public void setCylindres(int cylindres) {
		this.cylindres = cylindres;
	}

	@Override
	public String toString() {
		return "кількість циліндір = " + cylindres;
	}

	public Engine(int cylindres) {
		super();
		this.cylindres = cylindres;
	}
}
