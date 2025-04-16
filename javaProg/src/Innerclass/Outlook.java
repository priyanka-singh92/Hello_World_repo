package Innerclass;

public class Outlook implements Application
{
	@Override
	public void close() 
	{
		System.out.println("Outlook closed");
		
	}
	@Override
		public void open() 
	{
		System.out.println("Outlook open");
			
		}
}

