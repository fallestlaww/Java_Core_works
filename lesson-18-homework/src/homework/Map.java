package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


public class Map<K, V> extends MyEntry<K, V> {
	public HashMap<K,V> map;

	
	public Map(K key, V value) {
		super(key, value);
		this.map = new HashMap<K,V> ();
	}

	public void add(K key, V value) {
		map.put(key, value);
		System.out.println("Успішно створенно нову мапу: " + key + ", " + value);
	}
	
	public void removeK(K key) {
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			if(next.getKey().equals(key)) {
				iterator.remove();
				System.out.println("Ключ " + key + " успішно видалений");
			}
		}
	}
	
	public void removeV(V value) {
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			if(next.getValue().equals(value) ) {
				iterator.remove();
				System.out.println("Значення " + value + " успішно видалене");
			}
		}
	}
	
	public void set(K key) {
		Set set = new HashSet();
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			set.add(next.getKey());
			System.out.println("Сет ключів - " + set);
		}
		
	}
	
	public void list(V value) {
		List list = new ArrayList();
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			list.add(next.getValue());
			System.out.println("Ліст значення - " + list);
		}
	}
	
	public void map(K key, V value) {
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry next = (Entry) iterator.next();
			System.out.println("Мапа - " + next.getKey() + ", " + next.getValue());
	}
	
}
}
