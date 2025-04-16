package Java_Part2;

import java.util.Scanner;

class Fruit
{
	String color;
	int price;
	
	Fruit()
	{
	}
	
	Fruit(String color,int price)
	{
		
	}
	
}


class Apple extends Fruit 
		{
	int quantity;
	int calories;
	
	//this.quantity=quantity;
	//this.calories=calories;
		
	(Apple(String color, int price,int quantity,int calories)	
		
		{
		super(color, price);
		
		}
	
	public void appleDetails()
	{
		System.out.println(" ");
	}
}


class Mango extends Fruit
{
	
	Mango(String color, int price) {
		super(color, price);
		
		
	}

	public void mangoDetails()
	{
		System.out.println(" ");
	}
}

public class JavaGrooming28March {
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=scn.nextInt();
		
		
		Fruit ft=new Apple("red", 200, 5, 150);
		
		
		
		
		
		
		
		
		
		
		
	}

}

