package cinema;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cinema {
	TreeMap<Days, Schedule> schedules = new TreeMap<>();
	ArrayList<Movie> moviesLibrary = new ArrayList<>();
	Set<Seance> seances = new TreeSet<>();
	Days[] enumday = Days.values();
	Time open;
	Time close;
	Time time;
	
	public Time getOpen() {
		return open;
	}
	public void setOpen(Time open) {
		this.open = open;
	}
	public Time getClose() {
		return close;
	}
	public void setClose(Time close) {
		this.close = close;
	}
	public Cinema(Time open, Time close) {
		super();
		this.open = open;
		this.close = close;
	}
	@Override
	public String toString() {
		return "open=" + open + ", close="
				+ close;
	}
	
	public void addmovie() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фільму: ");
		String moviename = scanner.next();
		System.out.println("Введіть час, який займає фільм: ");
		System.out.println("Кількість годин: ");
		int hourcount = scanner.nextInt();
		System.out.println("Кількість хвилин: ");
		int minutecount = scanner.nextInt();
		Time duration = new Time(hourcount, minutecount);
		Movie movie = new Movie(moviename, duration);
		moviesLibrary.add(movie);
		System.out.println(moviename + " успішно доданий в список фільмів!");
	}

	public void addseance() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть день для назначення сеансу: ");
		String day1 = scanner.next().toUpperCase();

		for (Days days : enumday) {
			if (days.name().equalsIgnoreCase(day1)) {

				System.out.println("Введіть назву фільму ");
				String moviename = scanner.next().toUpperCase();
				System.out.println("Введіть, як довго фільм буде йти");
				System.out.println("Кількість годин: ");
				int moviehour = scanner.nextInt();
				System.out.println("Кількість хвилин:");
				int movieminute = scanner.nextInt();
				Time duration = new Time(moviehour, movieminute);
				System.out.println("Введіть коли починається фільм: ");
				System.out.println("Година:");
				int seancehour = scanner.nextInt();
				System.out.println("Хвилина:");
				int seanceminute = scanner.nextInt();
				Time seancestart = new Time(seancehour, seanceminute);
				Movie movie = new Movie(moviename, duration);
				Seance seance1 = new Seance(movie, seancestart);

				if (seancestart.getHour() < open.getHour() || seancestart.getHour() > close.getHour()) {
					System.out.println("З " + getClose() + " до " + getOpen() + " кінотеатр зачинено!");
				} else {
					seances.add(seance1);
					Schedule sch = new Schedule(seances);
					schedules.put(days, sch);
					System.out.println("Сеанс успішно створено");
				}
			}
		}
	}
	
	public void removemovie() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фільму: ");
		String moviename = scanner.next();

		Iterator<Movie> iterator = moviesLibrary.iterator();
		while (iterator.hasNext()) {
			Movie next = iterator.next();
			if (next.getTitle().equalsIgnoreCase(moviename)) {
				iterator.remove();
				System.out.println(moviename + " видалено зі списку фільмів");
			} else {
				System.out.println(moviename + " не знайдено");
			}
		}
	}
	
	
 	public void removeseance() throws Exception {
 		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть день сеансу: ");
		String day = scanner.next().toUpperCase();
		
		for (Days days : enumday) {
			if (days.name().equalsIgnoreCase(day)) {
				System.out.println("Введіть назву фільму: ");
				String moviename = scanner.next();
				System.out.println("Введіть час, який займає фільм:");
				System.out.println("Кількість годин:");
				int moviehour = scanner.nextInt();
				System.out.println("Кількість хвилин:");
				int movieminute = scanner.nextInt();
				Time movieduration = new Time(moviehour, movieminute);
				System.out.println("Введіть коли починається фільм:");
				System.out.println("Година: ");
				int seancehour = scanner.nextInt();
				System.out.println("Хвилина: ");
				int seanceminute = scanner.nextInt();
				Movie movie = new Movie(moviename, movieduration);
				Time seanceduration = new Time(seancehour, seanceminute);
				Seance seance = new Seance(movie, seanceduration);

				Set<Seance> seances2 = new TreeSet<>();
				seances2.add(seance);

				Iterator<Seance> iterator = seances.iterator();
				while (iterator.hasNext()) {
					Seance seance1 = (Seance) iterator.next();
					if (seance1.getMovie().getTitle().equalsIgnoreCase(moviename)) {
						if (schedules.containsValue(seances2)) {
							schedules.remove(days, seances2);
						}
						iterator.remove();
						System.out.println("Сеанс видалено зі списку");
					} else {
						System.out.println("Сеанс не знайдено");
					}
				}
			}
		}
	}
 	
 	public void allmovies() {
 		System.out.println("Всі фільми: " + moviesLibrary.toString());
 	}
 	
 	public void allseances() {
		System.out.print("Всі сеанси: " + seances.toString());
 	}
 }