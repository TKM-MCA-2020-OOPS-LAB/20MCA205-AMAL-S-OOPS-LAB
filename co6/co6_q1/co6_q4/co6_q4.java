package co6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class co6_q4 {
		 public static void main(String args[]) throws IOException { 
	     FileInputStream fr = new FileInputStream("numb.txt");
	     FileOutputStream fw1 = new FileOutputStream("even.txt");
	     FileOutputStream fw2 = new FileOutputStream("odd.txt");
	     System.out.println(" Copied even numbers and odd numbers to separate files..."); 
	     int i;
	     while((i=fr.read()) != -1) 
	    	  
	     {
	      if(i%2==0)
	      fw1.write(i);
	      else
	      fw2.write(i);
	     }
	     
	     fr.close();
	     fw1.close();
	     fw2.close();
	     
	 }
}


