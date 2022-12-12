package minimum;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnableThread implements Runnable{
	@Override
	public void run() {
		ArrayList fibonacci = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введіть кількість чисел Фібоначчі: ");
		int number = scanner.nextInt();
		int number1 = 1;
		int number2 = 1;
		fibonacci.add(number1);
		fibonacci.add(number2);
		for (int i = 2; i < number; i++) {
			int	number3= number1 + number2;
			fibonacci.add(number3);
			number1 = number2;
			number2 = number3;
		}
		for(int i = fibonacci.size()-1; i > 0; i--) {
			System.out.println(fibonacci.get(i));
		}
	}
}
