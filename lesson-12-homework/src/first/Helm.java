package first;

public class Helm {
	private int helmdiameter;
	private Material material;
	private Engine engine;
	public int getHelmdiameter() {
		return helmdiameter;
	}
	public void setHelmdiameter(int helmdiameter) {
		this.helmdiameter = helmdiameter;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return " діаметр руля = " + helmdiameter + ", матеріал руля = " + material + ", " + engine ;
	}
	public Helm(int helmdiameter, Material material, Engine engine) {
		super();
		this.helmdiameter = helmdiameter;
		this.material = material;
		this.engine = engine;
}
}
