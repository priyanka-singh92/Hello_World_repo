package Innerclass;

import java.util.ArrayList;

public class Mobile implements Device

ArrayList<Application> al = new ArrayList<Application>();
{
@Override
public Adapter adapter() {
	Adapter a = new Adapter()
			{
		@Override
		public void adapt() {
			System.out.println("Mobile Adapter");
			
		}
			};
	return a;
}
@Override
	public void install(Application a) {
		if(a!=null)
		//{String s=a.toString();
		//System.out.println(s.substring(s.indexOf('@'))+"Installed");
		{
			System.out.println(a+ "Installed");
		}
		
}
public void unistall(Application a) 
{
	if(a!=null)
	{
		System.out.println(a+ "Uninstalled");
	}
}
}
