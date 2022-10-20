package third;

public class Main {

	public static void main(String[] args) {
		MyArrayList<Integer> myarraylist = new MyArrayList<>();
		
		myarraylist.add(1);
		myarraylist.add(2);
		myarraylist.add(3);
		System.out.println(myarraylist);
		
		myarraylist.remove(1);
		System.out.println(myarraylist);
	}

}
