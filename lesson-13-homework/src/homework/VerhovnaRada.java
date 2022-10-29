package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerhovnaRada {
	private Fraction fractionname;
	private Deputy deputy;
	ArrayList<Fraction> rada = new ArrayList<>();
	
	public void addfraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String addfrac = scanner.nextLine();
		Fraction newfraction = new Fraction(addfrac);
		rada.add(newfraction);
		System.out.println("Нова фракція успішно створенна");
	}
	
	public void removefraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть назву фракції яку хочете видалити: ");
		String removefrac = scanner.nextLine();
		Iterator<Fraction> iterator = rada.iterator();
		while(iterator.hasNext()) {
			Fraction removefraction = iterator.next();
			if(removefraction.getFractionname().equalsIgnoreCase(removefrac)) {
				iterator.remove();
				System.out.println("Фракція успішно видалена");
			}
		}
	}
	
	public void allfractions() {
		Iterator<Fraction> iterator = rada.iterator();
		while(iterator.hasNext()) {
			Fraction allfractions = iterator.next();
			System.out.println(allfractions);
		}
	}
	
	public void showfraction() {
		System.out.println(fractionsearch().getFractionname());
	}
	
	public void clearfraction() {
		fractionsearch().fractionclear();
	}
	
	public void adddeputytofraction() {
		try {
			fractionsearch().adddeputy();
		} catch (Exception e) {
			System.out.println("Неможливо добавити депутата");
		}
	}
	
	public void removedeputyfromfraction() {
		try {
			fractionsearch().removedeputy();
		} catch (Exception e) {
			System.out.println("Неможливо видалити депутата");
		}
	}
	
	public void showallbrabetakers() {
		try {
			fractionsearch().bribetakercheck();
		} catch (Exception e) {
			System.out.println("У верховній раді немає хабарників");
		}
	}
	
	public void showheighestbrabetaker() {
		fractionsearch().heighestbribetaker();
	}

	
	public void showalldeputies() {
		try {
			fractionsearch().alldeputies();
		} catch (Exception e) {
			System.out.println("У раді ще немає депутатів");
		}
	}
	
	public Fraction fractionsearch() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть фракцію: ");
		String fraction = scanner.nextLine();
		Iterator<Fraction> iterator = rada.iterator();
		while (iterator.hasNext()) {
			Fraction newfraction = iterator.next();
			if (newfraction.getFractionname().equals(fraction)) {
				return newfraction;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Назва фракції: " + fractionname + "]";
	}
	
}

