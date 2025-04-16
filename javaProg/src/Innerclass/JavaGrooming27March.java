package Innerclass;

import java.util.Scanner;



class Bike
{
	private String brand;
	private int capacity;
	int price;
	String color;
	String vehiclenumber;
	
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	
	
	public void BikeDetails()
	{
	System.out.println("My dream bike is Apache");
	}
	
	public void LaunchYear()
	{
		System.out.println("The launch year of my bike is");
	}
}

class TvsApache extends Bike
{
	String model;
	int seats;
	int speed;
	
	TvsApache(String brand,int capacity,int price,String color,String vehiclenumber,String model,int seats,int speed)
	{
		this.model=model;
		this.seats=seats;
		this.speed=speed;
	}
	
	public void TvsapacheDetails()
	{
		System.out.println("My favourite bike");
	}
	
}

public class JavaGrooming27March {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=scn.nextInt();
		
		
		Bike bi=new Bike();
		System.out.println(bi.getBrand());
		System.out.println(bi.getCapacity());
		//System.out.println(bi.getPrice());
		//System.out.println(bi.getColor());
		//System.out.println(bi.getVehiclenumber());
		//System.out.println(bi.getCapacity());
		//System.out.println(bi.getCapacity());
		//System.out.println(bi.getCapacity());
		
	}
}
