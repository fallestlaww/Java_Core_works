package homework;

import java.util.Scanner;

public class Main {

	public static void main() {
		System.out.println("Нажміть 1, щоб додати фракцію");
		System.out.println("Нажміть 2, щоб видалити фракцію");
		System.out.println("Нажміть 3, щоб вивести усі фракції");
		System.out.println("Нажміть 4, щоб очистити конкретну фракцію");
		System.out.println("Нажміть 5, щоб вивести конкретну фракцію");
		System.out.println("Нажміть 6, щоб добавити депутата до фракції");
		System.out.println("Нажміть 7, щоб видалити депутата з фракції");
		System.out.println("Нажміть 8, щоб показати список усіх хабарників");
		System.out.println("Нажміть 9, щоб показати найбільшого хабарника");
	}
	
	public static void main(String[] args) {
		Fraction fraction = new Fraction(null);
		VerhovnaRada rada = new VerhovnaRada();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			main();
			switch (scanner.next()) {
				case "1": {
					rada.addfraction();
					break;
				}
				case "2": {
					rada.removefraction();
					break;
				}
				case "3": {
					rada.allfractions();
					break;
				}
				case "4": {
					rada.clearfraction();;
					break;
				}
				case "5": {
					rada.showfraction();
					break;
				}
				case "6": {
					rada.adddeputytofraction();
					break;
				}
				case "7": {
					rada.removedeputyfromfraction();
					break;
				}
				case "8": {
					rada.showallbrabetakers();
					break;
				}
				case "9": {
					rada.showheighestbrabetaker();
					break;
				}
			}
		}
	}
}

