package myproject;

import java.util.Scanner;

public class overloaded {
	int rectangle;
	int square;
	int rectangularprism;
    int area(int x,int y)
    { 
    	rectangle=x*y;
    	System.out.println("Area of rectangle is:"+rectangle);
		return rectangle;
    	
    }
    int area(int a)
    {   
    	square=a*a;
    	System.out.println("Area of square is:"+square);
		return square;
    	
    }
   
    int area(int w,int l,int h)
    {
    	int rectangularprism =2*((w*l)+(h*l)+(h*w));
    	System.out.println("Area of  rectangularprism is:"+rectangularprism);
		return  rectangularprism;
    	
    }
public static void main(String[] args) 
	{
	overloaded obj=new overloaded();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter x and y of rectangle:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println("enter a of square:");
	int a=sc.nextInt();
	System.out.println("enter w,l and h of  rectangularprism:");
	int w=sc.nextInt();
	int l=sc.nextInt();
	int h=sc.nextInt();
	obj.area(x,y);
	obj.area(a);
	obj.area(w,l,h);

	}

}
