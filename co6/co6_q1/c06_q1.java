package co6;
import java.io.*;  
public class c06_q1{
public static void main(String[] args) {  
	
 File file = new File("C:\\Users\\ACER\\Desktop\\git\\20MCA205-AMAL-S-OOPS-LAB\\co6\\co6_q1");
 String[] fileList = file.list(); 
 for(String str : fileList) {
      System.out.println(str);
    }
  FilenameFilter filter = new FilenameFilter() {
        public boolean accept (File dir, String name) { 
           return name.startsWith("p");
        } 
     }; 
     System.out.println("\n");
     String[] children = file.list(filter);
     if (children == null) {
     System.out.println(" not exist!!!");
     } else { 
        for (int i = 0; i< children.length; i++) {
           String filename = children[i];
           System.out.println(filename);
        } 
     }
}
} 