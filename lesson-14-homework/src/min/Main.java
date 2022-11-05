package min;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		System.out.println("Without sorting");
		Set<Person> set = new HashSet<>();
		set.add(new Person("Patrik", 26));
		set.add(new Person("Mike", 28));
		set.add(new Person("Andrew", 33));
		for (Person person : set) {
			System.out.println(person);
		}
		
		System.out.println();
		System.out.println("Sorted by comparable");
		Set<Person> set2 = new HashSet<>();
		set2.add(new Person("Mike", 28));
		set2.add(new Person("Patrik", 26));
		set2.add(new Person("Andrew", 33));
		for (Person person : set2) {
			System.out.println(person);
		}
		
		System.out.println();
		System.out.println("Sorted by comparator");
		TreeSet<Person> set3 = new TreeSet<>(new PersonAllFieldsComparator());
		set3.add(new Person("Patrik", 26));
		set3.add(new Person("Mike", 28));
		set3.add(new Person("Andrew", 33));
		set3.add(new Person("Andrew", 34));
		set3.add(new Person("Mike", 33));
		for (Person person : set3) {
			System.out.println(person);
		}
	}

}
