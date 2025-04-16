package Java_Part2;



class JavaGrooming24March {
	public static void main(String[] args) 
	{
		X obj=new X();
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		System.out.println(obj.getD());
		
		obj.setA(10);
		System.out.println(obj.getA());
		
		obj.setB("I am placed");
		System.out.println(obj.getB());
		
	}

}
class X
{
	private int a;
	private String b;
	private int c;
	int d;
	
	public int getA()
	{
		return a;
	}
	public String getB()
	{
		return b;
	}
    public int getD()
   {
	return d;
   }
	public int getC()
	{
		return c;
	}
	
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(String b)
	{
		this.b=b;
	}
}




