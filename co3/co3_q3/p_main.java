package co3_q3;

	import java.util.Scanner;

	public class p_main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int i;
			System.out.println("Enter number of persons: ");
			int n=sc.nextInt();
			Teacher k[]=new Teacher[n];
			for(i=0;i<n;i++) 
			{
				k[i]=new Teacher();
			}
			
			for(i=0;i<n;i++) 
			{
				k[i].display();
			}

		  }

		}




