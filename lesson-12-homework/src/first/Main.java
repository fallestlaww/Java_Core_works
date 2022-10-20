package first;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main() {
		System.out.println("Нажміть 1, щоб вивести всі результати у двохвимірному масиві(перероблений варіант)");
		System.out.println("Нажміть 2, щоб вивести всі результати в звичайному масиві(перероблений варіант)");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList material = new ArrayList();
		material.add(Material.values());
		while(true) {
			main();
			switch(scan.nextInt()) {
			case 1: {
				ArrayList car1 = new ArrayList();
				car1.add(new Car(getRandomValueFromRange(30, 600), getRandomValueFromRange(1960, 2022),
						new Helm(getRandomValueFromRange(20, 70), material(getRandomValueFromRange(1, 2)),
						new Engine(getRandomValueFromRange(2, 18))))); 
					System.out.println(car1);
				}break;
			
			case 2: {
				ArrayList newcar = new ArrayList();
				Car car = new Car(getRandomValueFromRange(30, 600), getRandomValueFromRange(1960, 2022),
						new Helm(getRandomValueFromRange(20, 70), material(getRandomValueFromRange(1, 2)),
						new Engine(getRandomValueFromRange(2, 18))));
				
				newcar.add(car);
				System.out.println(newcar);
			}break;
			}
		}

	}

	private static Material material(int j) {
		List material = new ArrayList();
		material.add(Material.values());
		for(int i = 0; i < material.size(); i++) {
			getRandomValueFromRange(1, 2);
			i++;
			if(i == 1) {
				return Material.leather;
			}
			
			if(i == 2) {
				return Material.alcantara;
			}
			
		}
		return null;
	}

	public static int getRandomValueFromRange(int min, int max) {
		if(min>=max) {
			throw new IllegalArgumentException("Мінімальне значення повинно бути менше за максимальне");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
