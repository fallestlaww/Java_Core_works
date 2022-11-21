package homework;

public class Integer {
	String string;

	

	public Integer(String string) {
		super();
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "Integer [string=" + string + "]";
	}
	
	
}
