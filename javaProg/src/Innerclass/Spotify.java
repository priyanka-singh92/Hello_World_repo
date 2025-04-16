package Innerclass;

public class Spotify implements Application
{
	@Override
		public void close() 
		{
			System.out.println("Spotify closed");
			
		}
		@Override
			public void open() 
		{
			System.out.println("Spotify open");
				
			}
}
