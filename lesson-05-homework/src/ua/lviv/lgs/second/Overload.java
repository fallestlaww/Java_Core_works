package ua.lviv.lgs.second;

public class Overload {
	int a;
	int b;
	int c;
	public Overload(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Overload(int b, int c) {
		this.b = b;
		this.c = c;
	}
	
}
