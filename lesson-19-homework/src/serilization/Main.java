package serilization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// first part
		File file = new File("Serialization.txt");
		Methods method = new Methods();
		Employee employee1 = new Employee("Viktor", 1, 1000);
		method.serialization(file, employee1);
		System.out.println(method.deserialization(file));
		System.out.println();
		
		//part 2
		File file2 = new File("TransientSerialization.txt");
		ArrayList<Employee> array = new ArrayList<>();
		array.add(employee1);
		array.add(new Employee("Andrew", 2, 500));
		array.add(new Employee("Max", 3, 1500));
		array.add(new Employee("Pablo", 4, 1500));
		method.serialization(file, array);
		System.out.println(method.deserialization(file));
	}

}
