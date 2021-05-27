package co3_q5;

import java.util.Scanner;

class Student  {
	String name;
	int maths,physics,chemistry,biology;
	Scanner st=new Scanner(System.in);
	
    Student()
    {   System.out.println("enter name:");
        name=st.next();
    	System.out.println("enter the mark of maths:");
    	maths=st.nextInt();
    	System.out.println("enter the mark of physics:");
    	physics=st.nextInt();
    	System.out.println("enter the mark of chemistry:");
    	chemistry=st.nextInt();
    	System.out.println("enter the mark of biology:");
    	biology=st.nextInt();
    }
}
class Sports extends Student {   
	int football,cricket;
	Scanner sp=new Scanner(System.in);
	
	Sports()
	{
		System.out.println("enter sports score: ");
		System.out.println("enter the score of football:");
		football=sp.nextInt();
		System.out.println("enter the score of cricket:");
		cricket=sp.nextInt();
		
	}
}
class Result extends Sports {
	
	void display() {
		System.out.println("-----****Academic Deatils Of Student****-----");
		System.out.println("Student name:"+name);
		System.out.println("-----------Mark of Subjects---------");
		System.out.println("\nmaths:\t"+maths+""+"\nphysics:\t"+physics+"\nchemistry:\t"+chemistry+"\nbiology:\t"+biology);
		System.out.println("Total subject mark:"+(maths+physics+chemistry+biology));
		System.out.println("-------Sports Score-------");
		System.out.println("football:\t"+football);
		System.out.println("cricket:\t"+cricket);
		System.out.println("Total Score of sports:"+(football+cricket));

	}

}
public class co3_q5 {

	public static void main(String[] args) {
		Result obj=new Result();
		obj.display();      

	}

}

