package lesson14rework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methods {
	List<Commodity> commodity = new ArrayList<>();
	Supplier<Commodity> maincommodityinformator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я товару");
		String name = scanner.next();
		System.out.println("Введіть вагу товару");
		int weight = scanner.nextInt();
		System.out.println("Введіть висоту товару");
		int height = scanner.nextInt();
		System.out.println("Введіть ширину товару");
		int widht = scanner.nextInt();
		return (Supplier<Commodity>) new Commodity(name, weight, height, widht);
	}
	
	void addcommodity() {
		Commodity addcommodity = maincommodityinformator().get();
		commodity.add(addcommodity);
		System.out.println("Товар успішно додано!");
	}
	
	void removecommodity() {
		Commodity removecommodity = maincommodityinformator().get();
		commodity.remove(removecommodity);
		System.out.println("Товар успішно видалено!");
	}
	
	void replacecommodity() {
		
		Commodity replacecommodity = maincommodityinformator().get();
		Predicate<Commodity> equaling = commodity -> commodity.getName().equalsIgnoreCase(replacecommodity.getName());
		Optional<Commodity> finding = commodity.stream().filter(equaling).findFirst();
		if(finding.isPresent()) {
			System.out.println("Вкажіть назву предмету який хочете замінити: ");
			Commodity newreplacedcommodity = maincommodityinformator().get();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Нова назва товару: ");
			String newname = scanner.nextLine();
			finding.get().setName(newreplacedcommodity.getName());
			System.out.println("Нова ширина товару: ");
			int newwidth = scanner.nextInt();
			finding.get().setWidth(newreplacedcommodity.getWidth());
			System.out.println("Нова довжина товару: ");
			int newlenght = scanner.nextInt();
			finding.get().setLenght(newreplacedcommodity.getLenght());
			System.out.println("Нова вага товару: ");
			int newweight = scanner.nextInt();
			finding.get().setWeight(newreplacedcommodity.getWeight());
			System.out.println("Товар успішно замінений!");
		}else {
			System.out.println("Товару не існує!");
		}
		}
	
	void namesortedcommodity() {
		System.out.println("До сортування товару за іменами: ");
		commodity.forEach(System.out::println);
		System.out.println();
		System.out.println("Після сортування товару за іменами: ");
		commodity.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(a -> System.out.println(a));
	}
	
	void lenghtsortedcommodity() {
		System.out.println("До сортування товару за довжиною: ");
		commodity.forEach(System.out::println);
		System.out.println();
		System.out.println("Після сортування товару за довжиною: ");
		commodity.stream().sorted((a, b) -> a.getLenght() - b.getLenght()).forEach(a -> System.out.println(a));
	}
	
	void widthsortedcommodity() {
		System.out.println("До сортування товару за шириною: ");
		commodity.forEach(System.out::println);
		System.out.println();
		System.out.println("Після сортування товару за шириною: ");
		commodity.stream().sorted((a, b) -> a.getWidth() - b.getWidth()).forEach(a -> System.out.println(a));
	}
	
	void weightsortedcommodity() {
		System.out.println("До сортування товару за вагою: ");
		commodity.forEach(System.out::println);
		System.out.println();
		System.out.println("Після сортування товару за вагою: ");
		commodity.stream().sorted((a, b) -> a.getWeight() - b.getWeight()).forEach(a -> System.out.println(a));
	}
	
	void specialelement() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть цифру об'єкта, якого хочете знайти(починати варто від 0):");
		int number = scanner.nextInt();
		Object[] array = commodity.toArray();
		System.out.println(array[number]);
	}
}
