package co6;
import java.io.*;  
class co6_q3 {
	
	public static void main(String[] args) throws IOException{
		    FileReader fr = new FileReader("input.txt");
			FileWriter fw = new FileWriter("output.txt", true);
             System.out.println("file copied");
			 int character;
             while ((character = fr.read()) != -1) {
            	 fw.write(character); 
             }
             fr.close();
             fw.close();
	}
}