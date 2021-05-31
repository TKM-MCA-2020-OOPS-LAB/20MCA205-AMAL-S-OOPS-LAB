package co3_q7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface calculation{
	void total();
	
}
class bill implements calculation{
	int p_id=101;
	int p_id1=102;
	int qnty=2;
	int qnty1=1;
	int unit=25,total,total1;
	int unit1=50;
	String name="A";
	String name1="B";
	
	DateFormat df=new SimpleDateFormat("dd/MM/yy");
	Date d = new Date();
	@Override
	public void total() {
		total=qnty*unit;
		total1=qnty1*unit1;
		}
	
public void display()
{
	System.out.println("Order No.101\n");
	System.out.println("Date: "+df.format(d));
	System.out.println("\nProduct Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
	System.out.println("________________________________________________________________________________________________________________________________");
	System.out.println(p_id+"\t\t\t"+name+"\t\t\t"+qnty+"\t\t\t\t"+unit+"\t\t\t\t"+total);
	System.out.println(p_id1+"\t\t\t"+name1+"\t\t\t"+qnty1+"\t\t\t\t"+unit1+"\t\t\t\t"+total1);
	System.out.println("_________________________________________________________________________________________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(total+total1));
	
    }
}

public class co3_q7 {
	public static void main(String[] args) 
	{
		bill obj=new bill();
		obj.total();
		obj.display();
	}
}
