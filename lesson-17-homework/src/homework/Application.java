package homework;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Integer[] arrayint = {1,42,92,13,591,323,40,11,24,241};
		Collection collection = new Collection(arrayint);
		Iterator iterator = collection.createCustomIterator();
		System.out.println("Список данних в масиві: " + Arrays.toString(arrayint));
		
		System.out.println();
		System.out.println("Список данних в масиві від першого до останнього ( із заміною парних чисел на 0 ) : ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		Iterator iterator2 = collection.createBackCustomIterator();
		System.out.println("Список данних в масиві від останнього до першого: ");
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println();
		
		Iterator iterator3 = collection.AnonimusIterator();
		System.out.println("Список данних в масиві від останнього до першого з перевіркою третього елемента на непарність: ");
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		System.out.println();
		
		Iterator iterator4 = collection.LocalIterator();
		System.out.println("Список данних масиву від першого до останнього елементу з додаванням 100 до кожного парного елементу:  ");
		while(iterator4.hasNext()) {
			System.out.println(iterator4.next());
		}
		System.out.println();
		
		Iterator iterator5 = collection.StaticIterator();
		System.out.println("Список данних масиву від першого до останнього елементу з перевіркою на парність ( перетворення на непарність після перевірки ): ");
		while(iterator5.hasNext()) {
			System.out.println(iterator5.next());
		}
	}

}
