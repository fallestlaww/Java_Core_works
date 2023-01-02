package lesson13rework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Fraction {
	private String name;
	List<Deputy> deputy = new ArrayList<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Deputy> getDeputy() {
		return deputy;
	}
	public void setDeputy(List<Deputy> deputy) {
		this.deputy = deputy;
	}
	public Fraction(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fraction [name=" + name + ", deputy=" + deputy + "]";
	}
	
	Supplier<Deputy> maindeputyinformaitor = () -> {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я депутата: ");
		String name = scanner.nextLine();
		System.out.println("Введіть прізвище депутата: ");
		String surname = scanner.nextLine();
		System.out.println("Введіть чи хабарник ваш депутат");
		boolean bribetaker = scanner.nextBoolean();
		return new Deputy(name, surname, bribetaker);
	};
	
	void adddeputy() {
		Deputy newdeputy = maindeputyinformaitor.get();
		deputy.add(newdeputy);
		System.out.println("Новий депутат успішно створений!");
	}
	
	void removedeputy() {
		Deputy removeddeputy = maindeputyinformaitor.get();
        Predicate<Deputy> equealsing = deputy -> deputy.getSurname().equalsIgnoreCase(removeddeputy.getSurname()) && deputy.getName().equalsIgnoreCase(removeddeputy.getName());
        Optional<Deputy> deputyfounded = deputy.stream().filter(equealsing).findFirst();
        if (deputyfounded.isPresent()) {
            deputy.remove(deputyfounded.get());
            System.out.println("Депутат " + deputyfounded.get().toString() + " видалений!");
        } else {
            System.out.println("Такого депутата немає!");
        }
	}
	
	void seebribers() {
		List<Deputy> bribetakers = deputy.stream().filter(Deputy::isBribetaker).collect(Collectors.toList());
		bribetakers.forEach(System.out::println);
	}
	
	void highestbribetaker() {
		System.out.println(Collections.max(deputy, new SizeOfBribeComparator()));
	}
	
	void seedeputies() {
		deputy.forEach(System.out::println);
	}
	
	void deletealldeputy() {
		if(deputy.size()<1) {
			System.out.println("Ви не можете видалити депутатів, так як у вас їх немає!");
		}else {
			deputy.clear();
			System.out.println("Всі депутати були очищені!");
		}
	}
	public Supplier<Deputy> getMaindeputyinformaitor() {
		return maindeputyinformaitor;
	}
	public void setMaindeputyinformaitor(Supplier<Deputy> maindeputyinformaitor) {
		this.maindeputyinformaitor = maindeputyinformaitor;
	}

}
