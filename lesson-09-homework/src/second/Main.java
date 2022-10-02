package second;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws MyException {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		System.out.println("Введіть перше число");
		if (scan.hasNextInt()) {
			a = scan.nextInt();
			System.out.println("Введіть друге число");
			if(scan.hasNextInt()) {
				b = scan.nextInt();
				Methods methods = new Methods(a, b);
				methods.results(methods.plus());
				methods.results(methods.minus());
				methods.results(methods.multiply());
				methods.results(methods.devide());
				
			}
		}
	}

}
