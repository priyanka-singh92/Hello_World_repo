package comparatorExample;

import java.util.Comparator;

public class YopComparator  implements Comparator<Student> {

	@Override
	public int compare(Student s1,Student s2)
	{
		if(s1.yop>s2.yop)
		{
			return 1;
		}
		
		else if(s1.yop<s2.yop) 
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
