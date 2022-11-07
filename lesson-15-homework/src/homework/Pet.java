package homework;

import java.util.Objects;

public class Pet {
	private String type;
	private String petname;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(petname, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(petname, other.petname) && Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Pet [type=" + type + ", petname=" + petname + "]";
	}
	public Pet(String type, String petname) {
		super();
		this.type = type;
		this.petname = petname;
	}
	
}
