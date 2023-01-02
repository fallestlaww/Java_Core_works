package lesson13rework;

import java.util.Comparator;

public class SizeOfBribeComparator implements Comparator<Deputy> {
	
	public int compare(Deputy o1, Deputy o2) {
		return o1.getBribesize() > o2.getBribesize() ? 1: -1;
	}

}
