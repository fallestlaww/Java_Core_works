package cinema;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
	Set<Seance> seances = new TreeSet<>();
	String seancename;
	
	
	public Set<Seance> getSeances() {
		return seances;
	}

	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}

	

	public String getSeancename() {
		return seancename;
	}

	public void setSeancename(String seancename) {
		this.seancename = seancename;
	}

	public Schedule(Set<Seance> seances) {
		super();
		this.seances = seances;
	}
	
	public void addSeance(Seance seance) {
		
	}
	
	public void removeSeance(Seance seance) {
		seances.remove(seance);
	}
}
