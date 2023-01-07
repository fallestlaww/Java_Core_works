package cinema;

public class Movie {
	String title;
	Time duration;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Time getDuration() {
		return duration;
	}
	public void setDuration(Time duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Назва фільму: " + title + ", кількість часу що займає: " + duration + "]";
	}
	public Movie(String title, Time duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	
	
}
