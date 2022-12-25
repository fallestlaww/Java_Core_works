package minimum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		filer(Employee.class);
	}
	
	public static void filer(Class<?> custom) throws IOException {
		ArrayList<String> annotationvalues = new ArrayList<>();
		File file = new File("Filer.txt");
		Field [] field = custom.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			Field field1 = field[i];
			if(field1.getAnnotation(Statistic.class) instanceof Statistic) {
				annotationvalues.add(field1.getName() + " ---> " + field1.getAnnotation(Statistic.class).value());
				writeUsingSymbolStream(file, annotationvalues.toString());
		}
		}
	}
	public static void writeUsingSymbolStream(File file, String field) throws IOException {
		Writer write = new FileWriter(file);
		write.write(field);
		write.close();
	}
}
