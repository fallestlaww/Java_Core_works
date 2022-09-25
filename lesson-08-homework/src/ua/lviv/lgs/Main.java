package ua.lviv.lgs;

import java.util.Scanner;


public class Main {
	
	private static void main() {
		System.out.println("Нажміть 1 для перевірки існування місяця: ");
		System.out.println("Нажміть 2 для виведення усіх місяців з одинаковою порою року: ");
		System.out.println("Нажміть 3 для виведення всіх місяців, які мають таку саму кількість днів");
		System.out.println("Нажміть 4 для виведення місяців з меншими кількостями днів");
		System.out.println("Нажміть 5 для виведення місяців з більшими кількостями днів");
		System.out.println("Нажміть 6, щоб вивести на екран наступну пору року");
		System.out.println("Нажміть 7, щоб вивести на екран попередню пору року");
		System.out.println("Нажміть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Нажміть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Нажміть 0, щоб перевірити чи введений з консолі місяць має парну кількість днів");
		
	}
	
	private static boolean ismonthpresent(Month[] massive, String monthes) {
		boolean flag = false;
		
		for(Month m: massive) {
			if(m.name().equals(monthes)) {
				System.out.println("Місяць існує");
				flag = true;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner month = new Scanner(System.in);
		Scanner season = new Scanner(System.in);
		Month [] massive = Month.values();
		Seasons [] massives = Seasons.values();
		
		while(true) { 
			main();
			switch (month.next()) {
			case "1": {
				System.out.print("Введіть місяць: ");
				month = new Scanner(System.in);
				String monthes = month.next().toUpperCase();
				boolean flag = false;
				
				for(Month m: massive) {
					if(m.name().equalsIgnoreCase(monthes)) {
						flag = true;
						System.out.println("Місяць існує");
					}
				}
				
				if (!flag) {
					System.out.println("Місяця не існує");
				}break;
			}
			case "2": {
				System.out.print("Введіть пору року: ");
				month = new Scanner(System.in);
				String seasonssc = month.next().toUpperCase();
				boolean flag = false;
				for(Month monthes: massive) {
					if(monthes.getS().name().equals(seasonssc)) {
						System.out.println(monthes);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Не існує такої пори року");
				}break;
			}
			case "3": {
				System.out.print("Введіть кількість днів: ");
				month = new Scanner(System.in);
				int daysc = month.nextInt();
				boolean flag = false;
				for(Month monthes: massive) {
					if(monthes.getDay() == daysc) {
						System.out.println(monthes);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Введіть коректну кількість днів");
				}break;
			}
			
			case "4": {
				System.out.println("Введіть кількість днів: ");
				month = new Scanner(System.in);
				int day = month.nextInt();
				boolean flag = false;
				for(Month monthes: massive) {
					if(monthes.getDay() < day) {
						System.out.println(monthes);
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("Такого місяця не існує");
				} break;
			}
			
			case "5": {
				System.out.println("Введіть кількість днів: ");
				month = new Scanner(System.in);
				int day = month.nextInt();
				boolean flag = false;
				for(Month monthes: massive) {
					if(monthes.getDay() > day) {
						System.out.println(monthes);
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("Такого місяця не існує");
				} break;
			}
		case "6": {
				System.out.println("Введіть пору року: ");
				season = new Scanner(System.in);
				String seas = season.next().toUpperCase();
				boolean flag = false;
				
				for(Seasons s: massives) {
					if(s.name().equals(seas)) {
						flag = true;
					}
				}
				
				if(flag) {
					Seasons season2 = Seasons.valueOf(seas);
					int ordinal = season2.ordinal();
					
					if(ordinal == (massives.length -1)) {
						ordinal = 0;
						System.out.println(massives[ordinal]);
					}else {
						System.out.println(massives[ordinal+1]);
					}
				}
				
				if(!flag) {
					System.out.println("Пори року не існує");
				} break;
			}
			case "7": {

				System.out.println("Введіть пору року:  ");
				season = new Scanner(System.in);
				String sseas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : massives) {
					if (s.name().equals(sseas)) {
						flag = true;
					}
				}
				if(flag) {
					Seasons seasonss = Seasons.valueOf(sseas);
					int ordinal = seasonss.ordinal();
					if(ordinal == 0) {
						System.out.println(Seasons.AUTUMN);
					}
					if(ordinal == massives.length +1) {
						System.out.println(massives[ordinal-1]);
					}else {
						System.out.println(massives[ordinal-1]);
					}
				if (!flag) {
					System.out.println("Пори року не існує");
				}
				break;
				
			}
		}
		
			case "8": {
				for (Month m: massive) {
					if(m.day % 2 == 0) {
						System.out.println(m);
					}
					
				}break;
				
			}
			
			case "9": {
				for (Month m: massive) {
					if(m.day % 31 == 0) {
						System.out.println(m);
					}
				}break;
			}
			
			case "0": {
				System.out.println("Введіть місяць для перевірки: ");
				month = new Scanner(System.in);
				String mon = month.next().toUpperCase();
				boolean flag = false;
				
				for(Month m: massive) {
					if(m.name().equalsIgnoreCase(mon)) {
						flag = true;
						if(m.getDay() % 2 == 0) {
							System.out.println("Місяць містить в собі парну кількість днів");
						}else {
							System.out.println("Місяць не містить в собі парну кількість днів");
						}
					}
				}
				if(!flag) {
					System.out.println("Місяця не існує");
				}break;
			}
		
	}
}
}
}