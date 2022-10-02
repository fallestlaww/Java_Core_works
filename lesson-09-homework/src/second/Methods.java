package second;

public class Methods{
	private static int a;
	private static int b;
	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public static void exceptions() throws IllegalAccessException, MyException {
		if((a < 0) && ( b<0 )) {
			String message = "Illegal Argument Exception";
			throw new MyException(message);
		}
		if(((a == 0) && (b != 0)) || ((a != 0) & (b == 0))) {
			String message = "Arithmetic Exception";
			throw new MyException(message);
		}
		if((a == 0) && (b == 0)) {
			String message = "Illegal Acces Exception";
			throw new MyException(message);
		}
		if((a > 0) && (b < 0)) {
			throw new MyException("Неправильно введені дані");
		}
	}
	
	public int plus() throws IllegalAccessException, MyException {
		Methods.exceptions();
		return a+b;
	}
	
	public int minus() throws IllegalAccessException, MyException {
		Methods.exceptions();
		return a-b;
	}
	
	public int multiply() throws IllegalAccessException, MyException {
		Methods.exceptions();
		return a*b;
	}
	
	public int devide() throws IllegalAccessException, MyException {
		Methods.exceptions();
		return a/b;
	}
	
	public void results(int result) {
		System.out.println("Результат: " + result);
	}
}
