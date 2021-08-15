import java.util.Scanner;
import java.util.Iterator;
import java.util.PriorityQueue;  
public class co4_q13 {  
    public static void main(String args[]) {
    	PriorityQueue<String> queue=new PriorityQueue<String>();  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees:");
 	    int num=sc.nextInt();
 	    for(int i=1;i<=num;i++){
        System.out.print("Add the name of employee id="+i+"\n");
        String s=sc.next();
        queue.add(s);
 	    }
 	    System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("Iterating the queue element:\n ");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("After removing two elements:\n");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
}