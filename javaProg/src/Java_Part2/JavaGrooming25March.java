package Java_Part2;

import java.util.Scanner;

class Test
{
	private int a;
	private String b;
	int c;
	String d;
	
	public int getA()
	{
		return a;
	}
	
	public String getB()
	{
		return b;
	}
	
	
	public void setA(int a)
	{
		this.a=a;
	}
	
	public void setB(String b)
	{
		this.b=b;
	}
	
	public void today()
	{
		System.out.println("I am sorted");
	}
}

public class JavaGrooming25March {
	
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the value");
	int n=scn.nextInt();
	
	Test ts=new Test();
	System.out.println(ts.getA());
	System.out.println(ts.getB());
	
	
	ts.setA(20);
	System.out.println(ts.getA());
	
	ts.setB("Java");
	System.out.println(ts.getB());
	
	
	




}
}
