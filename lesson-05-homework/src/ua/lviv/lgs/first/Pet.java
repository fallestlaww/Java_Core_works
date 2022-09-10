package ua.lviv.lgs.first;

public abstract class Pet {
	protected String name;
	protected String voice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", voice=" + voice + "]";
	}
	public Pet(String name, String voice) {
		super();
		this.name = name;
		this.voice = voice;
	}
	
	abstract void voice(); {
	}
}
