package ua.lviv.lgs.second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main() {
		System.out.println("Нажміть 1, щоб вивести всі результати у двохвимірному масиві");
		System.out.println("Нажміть 2, щоб вивести всі результати в звичайному масиві");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Material [] material = Material.values();
		while(true) {
			main();
			switch(scan.nextInt()) {
			case 1: {
				Car [][] car = new Car [1][1];
				for(int i = 0; i < car.length; i++) {
					for(int ii = 0; ii < car[i].length; ii++) {
						car[i][ii] = new Car(getRandomValueFromRange(30, 600), getRandomValueFromRange(1960, 2022),
								new Helm(getRandomValueFromRange(20, 70), material[getRandomValueFromRange(0, material.length - 1)],
								new Engine(getRandomValueFromRange(2, 18))));
								
								
					}
				}
				System.out.println(Arrays.deepToString(car));
			}break;
			
			case 2: {
				Car [] newcar = new Car[1];
				Car car = new Car(getRandomValueFromRange(30, 600), getRandomValueFromRange(1960, 2022),
						new Helm(getRandomValueFromRange(20, 70), material[getRandomValueFromRange(0, material.length - 1)],
						new Engine(getRandomValueFromRange(2, 18))));
				
				Arrays.fill(newcar, car);
				System.out.println(Arrays.toString(newcar));
			}break;
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
