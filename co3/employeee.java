package JAVA;
import java.util.Scanner;

public class employeee {
	int e_id;
	String e_name;
	double e_salary;
	String e_address;
	Scanner sc=new Scanner(System.in);
public  employeee()
	{   
     System.out.println("enter e_id:");
	 e_id=sc.nextInt();
	 System.out.println("enter e_name:");
	 e_name=sc.next();
     System.out.println("enter e_salary:");
	 e_salary=sc.nextDouble();
	 System.out.println("enter e_address:");
	 e_address=sc.next();
		   }
}
class teacher extends employeee
{
	String department;
	String subject;
	Scanner tr=new Scanner(System.in);
public teacher()
       {
		System.out.println("enter department:");
		department=tr.next();
		System.out.println("enter subject:");
		subject=tr.next();
	}	
public void display()
  {
	System.out.println("------*employee details*-------");
	System.out.println("emplyee_id:"+e_id);
	System.out.println("employee_name:"+e_name);
	System.out.println("employee_salary:"+e_salary);
	System.out.println("employee_address:"+e_address);
	System.out.println("department:"+department);
	System.out.println("subject:"+subject);
	
  }
	
public static void main(String[] args) {
	Scanner te =new Scanner(System.in);
	int i;
	System.out.println("Enter number of employees: ");
	int n=te.nextInt();
	teacher t[]=new teacher[n];
	for(i=0;i<n;i++) 
	{
	   t[i]=new teacher();
	}
	for(i=0;i<n;i++) 
	{
		t[i].display();
	}
  }
 }


