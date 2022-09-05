package ua.lviv.lgs;

public class Rectangle {
	private int width;
	private int height;
	
	Rectangle (int width) {
		this.width = width;
	}
	
	Rectangle () {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	
	
}

//for commit