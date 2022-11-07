package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Zooclub {
	Map <Person, List<Pet>> map = new HashMap<>();
	
	public void addperson() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я та прізвище: ");
		String name = scanner.nextLine();
		System.out.println("Введіть вік: ");
		int age = scanner.nextInt();
		map.put(new Person(name, age), new ArrayList<>());
		System.out.println(name + " був успішно добавлений до клубу");
	}
	
	public void addanimal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я тварини: ");
		String name = scanner.nextLine();
		System.out.println("Введіть породу тварини: ");
		String pet = scanner.nextLine();
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if(next.getKey().getName().equalsIgnoreCase(name)) {
				next.getValue().add(new Pet(pet, name));
			}
		}
		System.out.println(name + " успішно добавлений в список тварин");
	}
	
	public void removeperson() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я та прізвище: ");
		String name = scanner.nextLine();
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			if(next.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
		System.out.println(name + " успішно видалений із клубу");
	}
	
	public void removeanimal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть ім'я тварини: ");
		String name = scanner.nextLine();
		System.out.println("Введіть породу тварини: ");
		String pet = scanner.nextLine();
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			Iterator<Pet> iterator2 = next.getValue().iterator();
			while(iterator2.hasNext()) {
				Pet next2 = iterator2.next();
				if(next2.getPetname().equals(name)) {
					iterator2.remove();
				}
			}
		}
		System.out.println(name + " успішно видалено із списку тварин");
	}
	
	public void removeallanimaltype() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть породу тварини: ");
		String pet = scanner.nextLine();
		Iterator<Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> next = iterator.next();
			Iterator<Pet> iterator2 = next.getValue().iterator();
			while(iterator2.hasNext()) {
				Pet next2 = iterator2.next();
				if(next2.getType().equalsIgnoreCase(pet)) {
					iterator2.remove();
				}
			}
		}
		System.out.println("Усіх " + pet + " успішно видалено із списку тварин");
	}
	
	public void showzooclub() {
		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for (Entry<Person, List<Pet>> entry : entrySet) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());	
		}
	}
}
