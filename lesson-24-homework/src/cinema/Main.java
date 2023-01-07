package cinema;

import java.util.Scanner;

public class Main {
	public static void menu() {
		System.out.println("Введіть 1 щоб добавити фільм");
		System.out.println("Введіть 2 щоб добавити сеанс");
		System.out.println("Введіть 3 щоб видалити фільм");
		System.out.println("Введіть 4 щоб видалити сеанс");
		System.out.println("Введіть 5 щоб вивести список усіх фільмів");
		System.out.println("Введіть 6 щоб побачити всі сеанси");
		System.out.println("Введіть 0 щоб вийти з програми");
	}

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Cinema cinema = new Cinema(new Time(8, 00), new Time(21, 00));
		
		while(true) {
			menu();
			switch (scanner.next()) {
			case "1": {
				cinema.addmovie();
			}break;
			case "2": {
				cinema.addseance();
			}break;
			case "3": {
				cinema.removemovie();
			}break;
			case "4": {
				cinema.removeseance();
			}break;
			case "5": {
				cinema.allmovies();
			}break;
			case "6": {
				cinema.allseances();
			}break;
			case "0": {
				System.exit(0);
			}
		}
		}
	}
}
