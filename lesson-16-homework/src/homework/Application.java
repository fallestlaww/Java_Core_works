package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//min
		System.out.println("MIN");
		System.out.println();
		
		Class testclass = Test.class;
		String testname = testclass.getName();
		String simpletestname = testclass.getSimpleName();
		System.out.println("Name is " + testname);
		System.out.println("Simple name is " + simpletestname);
		System.out.println();
		
		int mod = testclass.getModifiers();
		System.out.println("Count of modifiers: " +mod);
		String modtext = Modifier.toString(mod);
		System.out.println("Modifer is " + Modifier.toString(mod));
		System.out.println("Modifier " + modtext + ", int = " + mod);
		System.out.println();
		
		Class [] interfaces = testclass.getInterfaces();
		System.out.println("Interfaces: " + Arrays.toString(interfaces));
		
		Constructor<Test> [] constructor = testclass.getConstructors();
		for (Constructor<Test> constructor1 : constructor) {
			System.out.println("Constructor consist of " + Arrays.toString(constructor));
		}
		System.out.println();
		
		System.out.println("Public fields: ");
		Field[] fields = testclass.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		System.out.println();
		
		System.out.println("All fields: ");
		fields = testclass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		System.out.println();
		
		Method [] methods = testclass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method );
		}
		
		
		
		//max 
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("MAX");
		System.out.println();
		
		Constructor<Test> constructor2 = testclass.getConstructor(String.class, int.class,	String.class, double.class);
		Test newInstanceTest = constructor2.newInstance("Test", 40, "First", 160);
		System.out.println("New test instance was created, its consists of: " + newInstanceTest);
		
		Field field = testclass.getField("name");
		field.set(newInstanceTest, "New Text");
		System.out.println("Test instance was succesfully reworked, now its consisting of: " + newInstanceTest);
		System.out.println();
		
		Constructor<Test> constructor3 = testclass.getConstructor(String.class, int.class,	String.class, double.class);
		Test newInstanceTest1 = constructor3.newInstance("Other Test", 60, "Second", 200);
		System.out.println("New test instance was created, its consists of: " + newInstanceTest1);
		Method method1 = testclass.getMethod("myMethod", String.class);
		method1.invoke(newInstanceTest1, "New Text");
		Method method2 = testclass.getMethod("myMethod", int.class);
		method2.invoke(newInstanceTest1, 123);
		System.out.println("Test instance was succesfully reworked, now its consisting of: " +newInstanceTest1);
		
		
	}

}
