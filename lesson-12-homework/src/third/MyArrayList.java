package third;

import java.util.Arrays;

public class MyArrayList<T> {
	private T[] list;
	private int size;
	private final int finalsize = 10;
	
	public MyArrayList() {
		list = (T[]) new Object[finalsize];	
	}
	
	public void add(T item) {
		list[size++] = item;
	}
	
	
	public void add(int index, T item) { 
		for(int i = size; i > index; i--) {
			list[index] = list[i-1];
		}
		size++;
	}
	
	public void remove(int index) {
		for(int i = index; i < size; i++) {
			list[i] = list[i+1];
		}
	}
	
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(list, size));
		
	}
}

