import java.util.*;  
public class co4_q12 {  
    public static void main(String args[]) {
        Stack<String> employee = new Stack<String>();
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of employees:");
 	    int num=sc.nextInt();
 	    for(i=1;i<=num;i++){
        System.out.print("Add the name of employee id="+i+":\n");
        String s=sc.next();
        employee.push(s);
 	    }
        System.out.println("Initial list of employees: " +employee);  
        System.out.println("Popped employee: " + employee.pop());  
        System.out.println("Popped employee: " + employee.pop()); 
        String rem_emp = employee.remove(2);
        System.out.println("Removing specified employee: "+ rem_emp);
        System.out.println("List of employees after pop operation " +employee);  
    }  
}  