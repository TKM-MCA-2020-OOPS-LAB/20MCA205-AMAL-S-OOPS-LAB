package co4;

import java.util.*;

interface calculation
{
	void rectangle();
	void triangle();
	void square();
	void circle();
}
public class co4_q1 implements calculation 
{
	int l,w,b,h,a,r,rectangle,square;
	double triangle,circle,pi=3.14;
	Scanner sc=new Scanner(System.in);
	public void rectangle()
	{
		System.out.println("Enter the length of Rectangle: ");
		l=sc.nextInt();
		System.out.println("Enter the breadth of Rectangle: ");
		w=sc.nextInt();
		rectangle=l*w;
		System.out.println("Area of Rectangle: "+rectangle);
		
	}
	public void triangle()
	{
		System.out.println("Enter the base length of Triangle: ");
		b=sc.nextInt();
		System.out.println("Enter the height of Triangle: ");
		h=sc.nextInt();
		triangle=((b*h)/2);
		System.out.println("Area of Triangle: "+triangle);
		
	}
		
	public void square()
	{
		System.out.println("Enter the side length of Square: ");
		a=sc.nextInt();
		square=a*a;
		System.out.println("Area of Square: "+square);
	
	}
	public void circle()
	{
		System.out.println("Enter the radius of Circle: ");
		r=sc.nextInt();
		circle=pi*r*r;
		System.out.println("Area of Circle: "+circle);
	}
}



 





