package max;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void menu() {
		System.out.println("Нажміть 1, щоб додати товар до списку");
		System.out.println("Нажміть 2, щоб видалити товар зі списку");
		System.out.println("Нажміть 3, щоб замінити товар в списку");
		System.out.println("Нажміть 4, щоб відсортувати товари за назвою");
		System.out.println("Нажміть 5, щоб відсортувати товари за довжиною");
		System.out.println("Нажміть 6, щоб відсортувати товари за шириною");
		System.out.println("Нажміть 7, щоб відсорувати товари за вагою");
		System.out.println("Нажміть 8, щоб вивести товар по індексу");
		System.out.println("Нажміть 9, щоб вийти з програми");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Commodity> commodityset = new HashSet<>();
		while(true) {
			menu();
			switch (scanner.next()) {
			case "1": {
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Вкажіть ім'я товару: ");
				String name = scanner1.nextLine();
				System.out.println("Вкажіть довжину товару: ");
				int width = scanner1.nextInt();
				System.out.println("Вкажіть ширину товару: ");
				int lenght = scanner1.nextInt();
				System.out.println("Вкажіть вагу товару: ");
				int weight = scanner1.nextInt();
				commodityset.add(new Commodity(name, width, lenght, weight));
				System.out.println("Товар успішно створенний");
				}break;
			case "2": {
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Вкажіть ім'я товару: ");
				String name = scanner1.nextLine();
				Iterator<Commodity> iterator = commodityset.iterator();
				while(iterator.hasNext()){
					if(iterator.next().getName().equalsIgnoreCase(name)) {
						iterator.remove();
						System.out.println("Товар успішно видалено");
					}
				}
			}break;
			case "3": {
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Вкажіть ім'я товару: ");
				String name = scanner1.nextLine();
				System.out.println("Вкажіть довжину товару:  ");
				int width = scanner.nextInt();
				System.out.println("Вкажіть ширину товару: ");
				int lenght = scanner.nextInt();
				System.out.println("Вкажіть вагу товару: ");
				int weight = scanner.nextInt();
				Iterator<Commodity> iterator = commodityset.iterator();
				while(iterator.hasNext()) {
					if(iterator.next().getName().equalsIgnoreCase(name)
							&iterator.next().getWidth() == width
							&iterator.next().getLenght() == lenght
							&iterator.next().getWeight() == weight) {
						System.out.println("Нова назва товару: ");
						String newname = scanner1.nextLine();
						iterator.next().setName(newname);
						System.out.println("Нова довжина товару: ");
						int newwidth = scanner1.nextInt();
						iterator.next().setWidth(newwidth);
						System.out.println("Нова ширина товару: ");
						int newlenght = scanner1.nextInt();
						iterator.next().setLenght(newlenght);
						System.out.println("Нова вага товару: ");
						int newweight = scanner1.nextInt();
						iterator.next().setWeight(newweight);
						System.out.println("Товар успішно замінений");
					}
				}
			}break;
			case "4": {
				System.out.println("До сортування за назвою: ");
				for (Commodity commodity : commodityset) {
					System.out.println(commodity);
				}
				System.out.println();
				TreeSet<Commodity> commodityset1 = new TreeSet<>(new CommodityNameComparator());
				commodityset1.addAll(commodityset);
				System.out.println("Після сортування за назвою: ");
				for (Commodity commodity : commodityset1) {
					System.out.println(commodity);
				}
				System.out.println();
			}break;
			case "5": {
				System.out.println("До сортування за довжиною: ");
				for (Commodity commodity : commodityset) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("Після сортування за довжиною: ");
				TreeSet<Commodity> commodidyset1 = new TreeSet<>(new CommodityWidthComparator());
				commodidyset1.addAll(commodityset);
				for (Commodity commodity : commodidyset1) {
					System.out.println(commodity);
				}
				System.out.println();
			}break;
			case "6": {
				System.out.println("До сортування за шириною: ");
				for (Commodity commodity : commodityset) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("Після сортування за шириною: ");
				TreeSet<Commodity> commodityset1 = new TreeSet<>(new CommodityLenghtComparator());
				commodityset1.addAll(commodityset);
				for (Commodity commodity : commodityset1) {
					System.out.println(commodity);
				}
				System.out.println();
			}break;
			case "7": {
				System.out.println("До сортування за шириною: ");
				for (Commodity commodity : commodityset) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("Після сортування за шириною: ");
				TreeSet<Commodity> commodityset1 = new TreeSet<>(new CommodityWeightComparator());
				commodityset1.addAll(commodityset);
				for (Commodity commodity : commodityset1) {
					System.out.println(commodity);
				}
				System.out.println();
			}break;
			case "8": {
				System.out.println("Введіть індекс товару: ");
				Scanner scan = new Scanner(System.in);
				int i = scan.nextInt();
				List<Commodity> commoditylist = new ArrayList<>();
				commoditylist.addAll(commodityset);
				System.out.println(commoditylist.get(i));
			}
			case "9": {
				System.exit(0);
			}
		}
	}
}
}
