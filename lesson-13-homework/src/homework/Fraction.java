package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {
	private String fractionname;
	String surname;
	
	public Fraction(String fractionname) {
		super();
		this.fractionname = fractionname;
	}

	public String getFractionname() {
		return fractionname;
	}

	public void setFractionname(String fractionname) {
		this.fractionname = fractionname;
	}

	ArrayList<Deputy> fraction = new ArrayList<>();
	
	public void adddeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я нового депутата: ");
		String name = scanner.nextLine();
		System.out.println("Введіть прізвище нового депутата: ");
		String surname = scanner.nextLine();
		System.out.println("Введіть вік нового депутата: ");
		int age = scanner.nextInt();
		System.out.println("Введіть вагу нового депутата: ");
		double weight = scanner.nextDouble();
		System.out.println("Введіть ріст нового депутата: ");
		double height = scanner.nextDouble();
		System.out.println("Вкажіть чи хабарник він(введіть true, якщо так або введіть false, якщо ні): ");
		boolean bribetaker = scanner.hasNextBoolean();
		
		try {
			Deputy newdeputy = new Deputy(weight, height, name, surname, age, bribetaker);
			fraction.add(newdeputy);
		} catch (Exception e) {
			System.out.println("Неможливо створити депутата");
		}
		
		System.out.println(name + " " +surname + " успішно створений");
	}
	
	public void removedeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть прізвище депутата, якого хочете видалити: ");
		String removesurname = scanner.nextLine();
		Iterator<Deputy> iterator = fraction.iterator();
		while(iterator.hasNext()) {
			Deputy removedeputy = iterator.next();
			if(removedeputy.getSurname().equalsIgnoreCase(removesurname)) {
				iterator.remove();
			}
		}
		System.out.println(removesurname + " успішно видалено зі списку депутатів");
	}
	
	public void bribetakercheck() {
		Iterator<Deputy> iterator1 = fraction.iterator();
		while(iterator1.hasNext()) {
			Deputy bribetakers = iterator1.next();
			if(bribetakers.isBribetaker()) {
				System.out.println(bribetakers);
			}else {
				System.out.println("У фракції немає взятників");
			}
		}
	}
	
	public void heighestbribetaker() {
		System.out.println(Collections.max(fraction, new DeputySizeOfBribeComperator()));

    }
	public void alldeputies() {
		System.out.println("Список депутатів: ");
		Iterator<Deputy> iterator2 = fraction.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
	
	public void fractionclear() {
		fraction.clear();
		System.out.println("Фракція успішно почищена");
	}

	@Override
	public String toString() {
		return "Fraction [fractioname=" + fractionname + "]";
	}
	
}
