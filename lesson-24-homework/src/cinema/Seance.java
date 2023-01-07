package cinema;

public class Seance implements Comparable<Seance>{
	Movie movie;
	Time startTime;
	Time endTime;
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return  movie + ", час початку " + startTime;
	}
	public Seance(Movie movie, Time startTime) throws Exception {
		super();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = Time.sumTime(startTime, movie.duration);
	}
	@Override
	public int compareTo(Seance o) {
		return this.getMovie().getTitle().compareToIgnoreCase(o.getMovie().getTitle());
	}
}
