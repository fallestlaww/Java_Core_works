package homework;

public class People {
	private double weight;
	private double height;
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "People [weight=" + weight + ", height=" + height + "]";
	}
	public People(double weight2, double height2) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	
}
