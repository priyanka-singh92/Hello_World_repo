package comparatorExample;

public class Student {
	
	String name;
	Integer yop;
	Double cgpa;
	
	
	public Student(String name, Integer yop, Double cgpa) {
		super();
		this.name = name;
		this.yop = yop;
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString()
	{
		return "[name=" +name+ ", yop=" +yop+" , cgpa=" +cgpa+ "]";
	}
	
	

}
