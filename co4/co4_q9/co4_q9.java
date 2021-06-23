import java.util.Scanner;
public class co4_q9 {

	public static void main(String[] args) {
		int i,j,temp,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		n = sc.nextInt();
		System.out.println("Enter the numbers:");
		int arr[]=new int[n];
		
		for (i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for (i=0;i<n;i++) {
			for (j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			   }
		}
		   
		System.out.println("The sorted numbers:");
	    for (i=0;i<n;i++)  {
	    	System.out.println(arr[i]);	
	    }
	}
}