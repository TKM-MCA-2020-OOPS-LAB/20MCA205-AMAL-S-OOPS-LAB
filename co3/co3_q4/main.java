package co3_q4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Enter your Choice \n1:LITERATURE\n2:FICTION");
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
			System.out.println("you are wrong");
	mm.close();
	}
}
	


