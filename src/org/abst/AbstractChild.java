package org.abst;
//child
public class AbstractChild extends AbstractDetails 
{
	public void name() 
	{
	System.out.println("prasad");
	}
	public void age() 
	{
		System.out.println("23");
	}
	public static void main(String[] args) 
	{
		AbstractChild a=new AbstractChild();
		a.name();
		a.age();
		a.address();
	}
}
