package second;

public class Car {
	private int horsepower;
	private int yearproduction;
	private Helm helm;
	private Engine engine;
	private Material material;
	
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
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Кількість кінських сил машини: " + horsepower + ", рік випуску машини: " + yearproduction + ", " + helm + ", "
				+ engine + ", матеріал салону: " + material + "";
	}
	public Car(int horsepower, int yearproduction, Helm helm, Engine engine, Material material) {
		super();
		this.horsepower = horsepower;
		this.yearproduction = yearproduction;
		this.helm = helm;
		this.engine = engine;
		this.material = material;
	}
	
}
