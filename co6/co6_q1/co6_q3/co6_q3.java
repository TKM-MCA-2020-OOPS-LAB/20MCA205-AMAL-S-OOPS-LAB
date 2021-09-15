package co6;
import java.io.*;  
public class co6_q3 {
	
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("C:\\Users\\ACER\\Desktop\\git\\20MCA205-AMAL-S-OOPS-LAB\\co6\\co6_q3\\in.txt");
			FileWriter fw = new FileWriter("out.txt");
             System.out.println("file copied");
			 int ch;
             while ((ch = fr.read()) != -1) {
            	 fw.write(ch); 
             }
             fr.close();
             fw.close();
	}
}