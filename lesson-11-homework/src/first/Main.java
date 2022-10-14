package first;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int [] integer = new int [5];
		for(int i = 0; i < integer.length; i++) {
			integer[i] = getRandomValueFromRange(-100, 100);
		}
		System.out.println("Список до редагування: " + Arrays.toString(integer));
		Arrays.sort(integer);
		System.out.println("Список після редагування: " + Arrays.toString(integer) + " ( редагування відбулось за зростанням )");
		Arrays.sort(integer, Collections.reverseOrder());
		System.out.println("Список після редагування: " + Arrays.toString(integer) + " ( редагування відбулось за спаданням )");
		
	}

	public static int getRandomValueFromRange(int min, int max) {
		if(min>=max) {
			throw new IllegalArgumentException("Мінімальне значення повинно бути менше за максимальне");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
