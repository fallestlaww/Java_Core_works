package second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main() {
		System.out.println("Нажміть 1, щоб вивести всі характеристики по введеним полям: ");
		System.out.println("Нажміть 2, щоб вивести всі характеристики, перенесені в звичайний масив: ");
	}
	
	public static void main(String[] args) {
		Material [] material = Material.values();
		Scanner scan = new Scanner(System.in);
		while(true) {
			main();
			switch(scan.nextInt()) {
			case 1: {
				Car [][] array = new Car[1][1];
				for(int i = 0; i < array.length; i++) {
					for(int ii = 0; ii < array[i].length; ii++) {
						array[i][ii] = new Car (getRandomValueFromRange(100, 250), getRandomValueFromRange(1960, 2022),
									new Helm (getRandomValueFromRange(25, 70)),
									new Engine(getRandomValueFromRange(1, 20)),
									material[getRandomValueFromRange(0, material.length - 1)]);
									
						 
					}
				}
				System.out.println(Arrays.deepToString(array));
				break;
			}
			case 2: {
				Car car = new Car (getRandomValueFromRange(100, 250), getRandomValueFromRange(1960, 2022),
						new Helm (getRandomValueFromRange(25, 70)),
						new Engine(getRandomValueFromRange(1, 20)),
						material[getRandomValueFromRange(0, material.length - 1)]);
				Car [] carnewarray = new Car[1];
				Arrays.fill(carnewarray, car);
				System.out.println(Arrays.deepToString(carnewarray));
			}
			}
		}
		
	}

	public static int getRandomValueFromRange(int min, int max) {
		if(min>=max) {
			throw new IllegalArgumentException("Мінімальне значення повинно бути менше за максимальне");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
}
