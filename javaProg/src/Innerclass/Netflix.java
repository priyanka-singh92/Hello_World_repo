package Innerclass;

public class Netflix implements Application
{

	@Override
		public void close() 
		{
			System.out.println("Netflix closed");
			
		}
		@Override
			public void open() 
		{
			System.out.println("Netflix open");
				
			}
}


