package max;

public class Commodity {
	private String name;
	private int width;
	private int lenght;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Commodity(String name, int width, int lenght, int weight) {
		super();
		this.name = name;
		this.width = width;
		this.lenght = lenght;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Commodity [name=" + name + ", width=" + width + ", lenght=" + lenght + ", weight=" + weight + "]";
	}
	
	
}
