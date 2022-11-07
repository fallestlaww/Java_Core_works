package homework;

import java.util.Scanner;

public class Main {
	public static void main() {
		System.out.println("Нажміть 1, щоб додати учасника клубу");
		System.out.println("Нажміть 2, щоб додати тваринку до учасника клубу");
		System.out.println("Нажміть 3, щоб видалити тваринку з учасника клубу");
		System.out.println("Нажміть 4, щоб видалити учасника клубу");
		System.out.println("Нажміть 5, щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Нажміть 6, щоб вивести дані клубу");
		System.out.println("Нажміть 7, щоб вийти з системи");
	}
	public static void main(String[] args) {
		Zooclub zoo = new Zooclub();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			main();
			switch(scanner.next()) {
			case "1": {
				zoo.addperson();
			}break;
			case "2": {
				zoo.addanimal();
			}break;
			case "3": {
				zoo.removeanimal();
			}break;
			case "4": {
				zoo.removeperson();
			}break;
			case "5": {
				zoo.removeallanimaltype();
			}break;
			case "6": {
				zoo.showzooclub();
			}break;
			case "7": {
				System.exit(0);
			}
			}
		}
		
	}

}
