package ua.lviv.lgs.second;

public class Car {
	private int horsepower;
	private int yearproduction;
	private Helm helm;
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public int getYearproduction() {
		return yearproduction;
	}
	public void setYearproduction(int yearproduction) {
		this.yearproduction = yearproduction;
	}
	public Helm getHelm() {
		return helm;
	}
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	@Override
	public String toString() {
		return "Кількість кінських сил = " + horsepower + ", рік випуску = " + yearproduction + "," + helm;
	}
	public Car(int horsepower, int yearproduction, Helm helm) {
		super();
		this.horsepower = horsepower;
		this.yearproduction = yearproduction;
		this.helm = helm;
	}
}
