package ua.lviv.lgs;

public class Circle {
	private int radius;
	private int diametr;
	
	Circle (int radius) {
		this.radius = radius;
	}
	
	Circle () {
		this.diametr = diametr;
	}

	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diametr=" + diametr + "]";
	}
	
	
	
}

//for commit