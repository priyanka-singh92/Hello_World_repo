package Innerclass;

import java.util.ArrayList;

public class Laptop implements Device
{
	
	ArrayList<Application> al = new ArrayList<Application>();
	@Override
	public Adapter adapter() {
		Adapter a = new Adapter()
				{
			@Override
			public void adapt() {
				System.out.println("Laptop Adapter");
				
			}
				};
		return a;
	}
	@Override
		public void install(Application a) {
			if(a!=null)
			
			{
				System.out.println(a+ "Installed");
			}
			
	}
	public void uninstall(Application a) 
	{
		if(a!=null)
		{
			System.out.println(a+ "Uninstalled");
		}
	}
	}

