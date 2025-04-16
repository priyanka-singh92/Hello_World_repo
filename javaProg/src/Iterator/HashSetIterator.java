package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
	
	public static void main(String[] args) {
		
	
	
	HashSet hs=new HashSet();
	
	hs.add("Manual");
	hs.add("Java");
	hs.add("SQL");
	hs.add("Selenium");
	hs.add("API");
	
	Iterator itr =hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	


	}
}
