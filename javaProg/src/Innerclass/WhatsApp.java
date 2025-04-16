package Innerclass;

public class WhatsApp implements Application
{@Override
public void close() 
{
	System.out.println("WhatsApp closed");	
	
}
@Override
	public void open() 
{
	System.out.println("WhatsApp open");		
	}
}
