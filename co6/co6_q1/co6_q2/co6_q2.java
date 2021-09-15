package co6;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class co6_q2 {
	public static void main(String[] args){
		try {
            FileWriter writer = new FileWriter("java.txt", true);
            writer.write("Hello World\n");
            writer.write("Hello java\n");  
            writer.write("Good Bye!\n");
            writer.close();
            FileReader reader = new FileReader("java.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            System.out.println("File reading and writing both done\n");
            
	} catch (IOException e) {
		System.out.println("Error reading file named java.txt");
        }
 
    }
}