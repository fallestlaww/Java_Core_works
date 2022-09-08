package ua.lviv.lgs.first;

public class Main {
	public static void main(String[] args) {
		Robot robot = new Robot ("Robot", "просто працюю");
		CoffeeRobot coffee = new CoffeeRobot();
		DancerRobot danser = new DancerRobot();
		CoockerRobot coocker = new CoockerRobot();
		Robot [] array = new Robot [4];
		array[0] = robot;
		array[1] = coffee;
		array[2] = danser;
		array[3] = coocker;
		
		for (int i = 0; i<array.length; i++){
            array[i].work();
		} 
	}
}
