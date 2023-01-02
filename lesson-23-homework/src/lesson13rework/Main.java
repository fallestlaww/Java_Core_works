package lesson13rework;

import java.util.Scanner;

public class Main {
	public static void main() {
		System.out.println("Нажміть 1 щоб додати фракцію");
		System.out.println("Нажміть 2 щоб видалити фракцію");
		System.out.println("Нажміть 3 щоб вивести усі фракції");
		System.out.println("Нажміть 4 щоб очистити конкретну фракцію");
		System.out.println("Нажміть 5 щоб вивести конкретну фракцію");
		System.out.println("Нажміть 6 щоб добавити депутата до фракції");
		System.out.println("Нажміть 7 щоб видалити депутата з фракції");
		System.out.println("Нажміть 8 щоб показати список усіх хабарників");
		System.out.println("Нажміть 9 щоб показати найбільшого хабарника");
	}
	
	public static void main(String[] args) {
		Fraction fraction = new Fraction(null);
		VerhovnaRada verhovnarada = new VerhovnaRada();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			main();
			switch (scanner.next()) {
			case "1": {
				verhovnarada.addfraction();
				break;
			}
			case "2": {
				verhovnarada.removefraction();
				break;
			}
			case "3": {
				verhovnarada.seefractions();
				break;
			}
			case "4": {
				verhovnarada.deletealldeputies();
				break;
			}
			case "5": {
				verhovnarada.seespecialfraction();
				break;
			}
			case "6": {
				verhovnarada.adddeputytofraction();
				break;
			}
			case "7": {
				verhovnarada.removedeputyfromfraction();
				break;
			}
			case "8": {
				verhovnarada.seeallbribetakers();
				break;
			}
			case "9": {
				verhovnarada.seethehighestbribetaker();
				break;
			}
			}
		}
		}
	}
	