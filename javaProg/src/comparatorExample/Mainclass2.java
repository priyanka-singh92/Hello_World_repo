package comparatorExample;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Mainclass2 {
	
	public static void main(String[] args) {
		
		

		PriorityQueue<Product> pq=new PriorityQueue<Product> (new RatingComparator());
		
		pq.offer(new Product(101,7800.0,4.4));
		pq.offer(new Product(102,6500.0,4.6));
		pq.offer(new Product(103,8400.0,4.5));
		pq.offer(new Product(104,6000.0,4.2));
		pq.offer(new Product(105,9500.0,4.8));
		
		//for(Product product:pq)   ---->for each loop 
		//{
		//	System.out.println(product);
		//}
		
		Product p=pq.poll();      //(best way to retrieve element from priority queue)
		while(p!=null)
			
		{
			System.out.println(p);
			p=pq.poll();
		}

}
}
