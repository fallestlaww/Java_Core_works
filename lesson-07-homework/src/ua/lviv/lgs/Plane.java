package ua.lviv.lgs;

public abstract class Plane implements Number2 {
	AirplaneControl airplaneControl = new AirplaneControl();
	int weight;
	int height;
	int length;
	int maxSpeed;

	
	void up () {
		AirplaneControl.up();
	}
	
	void down() {
		AirplaneControl.down();
	}
	
	void left() {
		AirplaneControl.left();
	}
	
	void right() {
		AirplaneControl.right();
	}
	
	public Plane(int weight, int height, int length, int maxSpeed) {
		super();
		this.weight = weight;
		this.height = height;
		this.length = length;
		this.maxSpeed = maxSpeed;
	}

	public void EngineStart() {
		System.out.println("There are " + Number2.number() + " seconds before takeoff.");
	}	
	
	public void Takeoff() {
		System.out.println("СУ-27 is sucessfully taked off. The biggest number of kilometers it will fly - " + Number.number() + " kilometers.");
	}
	
	public void Boarding() {
		System.out.println("СУ-27 is going to board.");
	}
}
