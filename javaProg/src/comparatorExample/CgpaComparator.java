package comparatorExample;

public class CgpaComparator implements Comparator<Student>{

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
	
	//@Override   ------>2ndway to override
	//public int compare(Student 01,Student 02)
	//{
	//	return 01.cgpa.compareTo(02.cgpa);
	//}
}
