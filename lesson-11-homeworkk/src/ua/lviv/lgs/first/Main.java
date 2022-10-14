package ua.lviv.lgs.first;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		int [] integer = {241, 4124, 2, 956, 553};
		System.out.println("Список до редагування: " + Arrays.toString(integer));
		Arrays.sort (integer);
		System.out.println("Список за зростанням після редагування: " + Arrays.toString(integer));
		
		
//		The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
//		Arrays.sort(integer, Collections.reverseOrder());
		
}
}
