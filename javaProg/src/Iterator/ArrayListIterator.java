package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
	
	
	ArrayList al=new ArrayList();
	
	al.add("Java");
	al.add("SQL");
	al.add("Web");
	al.add("j2ee");
	al.add("framework");
	
	Iterator itr =al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}
}
