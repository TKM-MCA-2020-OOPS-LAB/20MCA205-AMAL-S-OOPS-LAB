package co3_q4;

import java.util.Scanner;

public class Publisher {
	String pub_name;
	Scanner sc=new Scanner(System.in);
	
	Publisher()
	{
		System.out.println("Enter publisher name");
		pub_name=sc.nextLine();
	
	}
}

class book extends Publisher {
	String book_name,author;
	int page_no;
	Scanner bk=new Scanner(System.in);
	
	book() {
		System.out.println("Enter Book name");
		book_name=bk.nextLine();
		System.out.println("Enter author");
		author=bk.nextLine();
		System.out.println("Enter page");
		page_no=bk.nextInt();
	}
}

class literature extends book {
	String language;
	Scanner li=new Scanner(System.in);
	
	literature() {
		System.out.println("Enter which language");
		language=li.nextLine();
	}
	void display()
	{
		System.out.println(".............***LITERATURE***..............");
		System.out.println("Publisher name is "+pub_name);
	    System.out.println("Book name is "+book_name);
		System.out.println("Autho name is "+author);
		System.out.println("Page is "+page_no);
		
	}
}


class fictions extends book {
	String language;
	Scanner fi=new Scanner(System.in);
	
	fictions() {
		System.out.println("Enter which language");
		language=fi.nextLine();
	}
	void display()
	{
		System.out.println(".............***FICTION***..............");
		System.out.println("Publisher name is "+pub_name);
		System.out.println("Book name is "+book_name);
		System.out.println("Author name is "+author);
		System.out.println("Page is "+page_no);
		
	}

	public static void main(String[] args) {
		int a,b,c;
		Scanner mm=new Scanner(System.in);
		System.out.println("Enter number of literatures books");
		a=mm.nextInt();
		literature l[]=new literature[a];
		for(int i=0;i<a;i++) {
			l[i]=new literature();
		}
		System.out.println("Enter number of fictions books");
		b=mm.nextInt();
		fictions f[]=new fictions[b];
		for(int i=0;i<b;i++) {
			f[i]=new fictions();
		}
		System.out.println("Enter your Choice \n:literatures\n2:fictions");
		c=mm.nextInt();
		if(c==1) {
			for(int i=0;i<a;i++) {
				l[i].display();
			}
		}
		else if(c==2) {
			for(int i=0;i<a;i++) {
				f[i].display();
		}
	}
		else
			System.out.println("wrong");
	mm.close();
	}
}

	