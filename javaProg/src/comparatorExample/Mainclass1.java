package comparatorExample;

import java.util.TreeSet;

public class Mainclass1 {
	
	public static void main(String[] args) {
		
	

	TreeSet<Student> ts=new TreeSet<Student> (new YopComparator());
	//TreeSet<Student> ts=new TreeSet<Student> (new NameComparator);
	//TreeSet<Student> ts=new TreeSet<Student> (new CgpaComparator);
			
	ts.add(new Student("Rama",2021,7.6));
	ts.add(new Student("Krishna",2023,8.5));
	ts.add(new Student("Shiva",2022,9.6));
	ts.add(new Student("Durga",2025,8.3));
	ts.add(new Student("Laxmi",2024,9.5));
	
	for(Student s:ts)                      //for each loop
	{
		System.out.println(s);
	}
}
}
