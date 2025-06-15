package StudentApplicationEx;

import java.util.Comparator;

public class NameWiseComparator implements Comparator<StudentObj>{
	@Override
	public int compare(StudentObj o1, StudentObj o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
