package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveIteratorExample {
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add("Python");
		ll.add("Web");
		ll.add("SQL");
		ll.add("Django");
		ll.add("Flask");
		
		System.out.println(ll);
		
		Iterator itr =ll.iterator();
		while(itr.hasNext())
		{
			String s=itr.next().toString();
			
			if(s.equals("Django"))
			{
				itr.remove();
			}
		}
		
		System.out.println(ll);
	}

}
