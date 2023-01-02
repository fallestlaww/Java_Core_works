package lesson14rework;

import java.util.Scanner;

public class Main {
	public static void main() {
		System.out.println("Нажміть 1 щоб додати товар до списку");
		System.out.println("Нажміть 2 щоб видалити товар зі списку");
		System.out.println("Нажміть 3 щоб замінити товар в списку");
		System.out.println("Нажміть 4 щоб відсортувати товари за назвою");
		System.out.println("Нажміть 5 щоб відсортувати товари за довжиною");
		System.out.println("Нажміть 6 щоб відсортувати товари за шириною");
		System.out.println("Нажміть 7 щоб відсорувати товари за вагою");
		System.out.println("Нажміть 8 щоб вивести товар по індексу");
		System.out.println("Нажміть 9 щоб вийти з програми");
	}
	public static void main(String[] args) {
		Methods method = new Methods();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			main();
			switch (scanner.next()){
				case "1": {
					method.addcommodity();
					break;
				}
				case "2": {
					method.removecommodity();
					break;
				}
				case "3": {
					method.replacecommodity();
					break;
				}
				case "4": {
					method.namesortedcommodity();
					break;
				}
				case "5": {
					method.lenghtsortedcommodity();
					break;
				}
				case "6": {
					method.widthsortedcommodity();
					break;
				}
				case "7": {
					method.weightsortedcommodity();
					break;
				}
				case "8": {
					method.specialelement();
				}
				case "9": {
					System.exit(0);
				}
		}
	}

}
}