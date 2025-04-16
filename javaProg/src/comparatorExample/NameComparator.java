package comparatorExample;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	
	public int compare(Student 01,Student 02)
	{
		return 01.name.compareTo(02.name);
	}

	
	
}
