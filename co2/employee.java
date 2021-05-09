package myproject;

import java.util.Scanner;

public class employee 
{
	int empNo;
	String empName;
	float empSalary;
	public void getinfo()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id: ");
		empNo=sc.nextInt();
		System.out.println("Enter name: ");
		empName=sc.next();
		System.out.println("Enter salary: ");
		empSalary=sc.nextFloat();
	}
	public void display()
	{
		System.out.println("Employee id: "+ empNo);
		System.out.println("Employee name: "+ empName);
		System.out.println("Employee salary:"+ empSalary);
	}
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		int i;
		System.out.println("Enter number of employees: ");
		int a=sc1.nextInt();
		employee e[]=new employee[a];
		for(i=0;i<a;i++) 
		{
			e[i]=new employee();
			e[i].getinfo();
		}
		System.out.println("Employee details are:\n\n");
		for(i=0;i<a;i++) 
		{
			e[i].display();
		}
		System.out.println("Enter the Employee id to search: ");
		int id=sc1.nextInt();
		
		boolean temp=false;
	    for(i=0;i<a;i++) 
	    {
	    	if(id==e[i].empNo) 
		    {
	    		temp=true;
			    break;
		     }
	     }
	     if(temp==true) 
	     {
		     e[i].display();
	     }
	     else
		  System.out.println("Employee details are not found!?");	
		
	}
}
	
	


