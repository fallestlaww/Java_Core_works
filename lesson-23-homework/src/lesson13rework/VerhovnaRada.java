package lesson13rework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class VerhovnaRada {
	List<Fraction> fraction = new ArrayList<>();
	
	Supplier<Fraction> mainfractioninformator = () -> {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву фракції: ");
        String fraction = scanner.next();
        return new Fraction(fraction);
    };
	
    public Optional<Fraction> deputygroupinformator(){ 
    	Fraction groupdeputy = mainfractioninformator.get();
        Predicate<Fraction> equelsing = fraction -> fraction.getName().equalsIgnoreCase(groupdeputy.getName());
        Optional<Fraction> foundedgroupdeputy = fraction.stream().filter(equelsing).findFirst();
        return foundedgroupdeputy;
    }
    
    void addfraction() {
		fraction.add(mainfractioninformator.get());
		System.out.println("Фракція успішно створена");
	}
	
	void removefraction() {
		Optional<Fraction> removedfraction = deputygroupinformator();
		if(removedfraction.isPresent()) {
			fraction.remove(removedfraction.get());
			System.out.println("Фракція видалена!");
		}else {
			System.out.println("Фракції не існує!");
		}
	}
	
	void seefractions() {
		System.out.println("Список фракцій: ");
		fraction.forEach(System.out::println);
	}
	
	void seespecialfraction() {
		Fraction specialfraction = mainfractioninformator.get();
	}
	
	void adddeputytofraction() {
		Optional<Fraction> fraction = deputygroupinformator();
		if(fraction.isPresent()) { 
			fraction.get().adddeputy();
			System.out.println("Депутата додано!");
		}else {
			System.out.println("Фракції не існує!");
		}
	}
	
	void removedeputyfromfraction() {
		Optional<Fraction> fraction = deputygroupinformator();
		if(fraction.isPresent()) { 
			fraction.get().removedeputy();
			System.out.println("Депутата видалено!");
		}else {
			System.out.println("Фракції не існує!");
		}
	}
	
	void seeallbribetakers() {
		Optional<Fraction> fraction = deputygroupinformator();
		if(fraction.isPresent()) {
			fraction.get().seebribers();
		}else {
			System.out.println("Фракції не існує!");
		}
	}
	
	void seethehighestbribetaker() {
		Optional<Fraction> fraction = deputygroupinformator();
		if(fraction.isPresent()) {
			fraction.get().highestbribetaker();
		}else {
			System.out.println("Фракції не існує!");
		}
	}
	
	void seealldeputies() {
		Optional<Fraction> fraction = deputygroupinformator();
		if(fraction.isPresent()) {
			fraction.get().seedeputies();
		}else {
			System.out.println("Фракції не існує!");
		}
	}
	
	void deletealldeputies() {
		Optional<Fraction> fraction = deputygroupinformator();
		if(fraction.isPresent()) {
			fraction.get().deletealldeputy();
		}else {
			System.out.println("Фракції не існує!");
		}
	}
}
