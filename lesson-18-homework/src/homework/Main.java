package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// task min
		List<Integer> list = new ArrayList();
		list.add(new Integer("123"));
		System.out.println(list);
		System.out.println();
		// Наскільки я зрозумів, це можливо лише якщо в класі Integer описати String поля
		
		
		// task max
		Map map = new Map(111, 123);
		map.add("123", "228");
		map.add("123", "228");
		map.add(232, 111);
		map.add(555, 666);
		map.removeK("123");
		map.removeV("228");
		map.list(map);
		map.map(map, map);
		map.set(map);


	}
}
