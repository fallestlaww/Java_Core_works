/*
 * Homework file
 * */

package first;
import java.util.Scanner;

/**
 * @author fallestlaw
 * @since java 1.8
 * @version 1.2
 * **/


public class Main {
	/**
	 * @throws WrongInputConsoleException
	 * @see homework
	 * @author fallestlaw
	 * @return null
	 * */
	
	/*Консольна програма*/
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
	
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		/*Сканер для роботи з енумом Month*/
		Scanner month = new Scanner(System.in);
		/*Сканер для роботи з енумом Seasons*/
		Scanner season = new Scanner(System.in);
		/*Масив з константами усіх місяців*/
		Month [] massive = Month.values();
		/*Масив з константами усіх пір року*/
		Seasons [] massives = Seasons.values();
		
		while(true) { 
			main();
			switch (month.next()) {
			/*Логіка для перевірки існування місяця*/
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
					String message = "Місяця не існує";
					throw new WrongInputConsoleParametersException(message);
				}break;
			}
			case "2": {
				/*Логіка для виведення усіх місяців з однаковою порою року*/
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
					String message = "Такої пори року не існує";
					throw new WrongInputConsoleParametersException(message);
				}break;
			}
			case "3": {
				/*Логіка для виведення усіх днів з однаковою кількістю днів*/
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
					String message = "Місяців з такою кількістю днів не існує";
					throw new WrongInputConsoleParametersException(message);
				}break;
			}
			
			case "4": {
				/*Логіка для виведення усіх днів з меншою кількістю днів*/
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
					String message = "Місяців з меншою кількістю днів не існує. Найменша кількість - 28.";
					throw new WrongInputConsoleParametersException(message);
				} break;
			}
			
			case "5": {
				/*Логіка для виведення усіх днів з більшою кількістю днів*/
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
					String message = "Місяців з більшою кількістю днів не існує. Найбільша кількість - 31.";
					throw new WrongInputConsoleParametersException(message);
				} break;
			}
		case "6": {
				/*Логіка для виведення наступної пори року*/
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
					String message = "Пори року не існує.";
					throw new WrongInputConsoleParametersException(message);
				} break;
			}
			case "7": {
				/*Логіка для виведення попередньої пори року*/
				System.out.println("Введіть пору року:  ");
				season = new Scanner(System.in);
				String sseas = season.next().toUpperCase();
				
				boolean flag = false;
				
				for (Seasons s : massives) {
					if (s.name().equals(sseas)) {
						flag = true;
					}
				}
				if(flag = true) {
					Seasons seasonss = Seasons.valueOf(sseas);
					int ordinal = seasonss.ordinal();
					ordinal = 0;
					if(ordinal == massives.length +1) {
						System.out.println(massives[ordinal-1]);
					}else {
						System.out.println(massives[ordinal-1]);
					}
				if (!flag) {
					String message = "Пори року не існує";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
				
			}
		}
		
			case "8": {
				/*Логіка для виведення днів з парною кількістю днів*/
				for (Month m: massive) {
					if(m.day % 2 == 0) {
						System.out.println(m);
					}
					
				}break;
				
			}
			
			case "9": {
				/*Логіка для виведення днів з непарною кількістю днів*/
				for (Month m: massive) {
					if(m.day % 31 == 0) {
						System.out.println(m);
					}
				}break;
			}
			
			case "0": {
				/*Логіка для перевірки наявності парної кількості днів в місяці*/
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
					String message = "Місяця не існує";
					throw new WrongInputConsoleParametersException(message);
				}break;
			}
		
	}
}
	}

}
