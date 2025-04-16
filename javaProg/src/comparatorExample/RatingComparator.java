package comparatorExample;

import java.util.Comparator;

public class RatingComparator implements Comparator<Product>
{
@Override
public int compare(Product o1, Product o2)
{
	return o1.rating.compareTo(o2.rating);
}
}
