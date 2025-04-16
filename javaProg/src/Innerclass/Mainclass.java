package Innerclass;

public class Mainclass 
{
public static void main(String[] args) 
{
	Mobile m= new Mobile();
	
    WhatsApp ref=new WhatApp();
	m.install(ref);
	
	m.install(new Netflix());
	m.install(new Spotify());
	m.install(new Outlook());
	
	System.out.println(m.al.size());
	m.uninstall(ref);
	
	System.out.println(m.al.size());
	Adapter a=m.adapter();
	a.adapt();
	
}
}