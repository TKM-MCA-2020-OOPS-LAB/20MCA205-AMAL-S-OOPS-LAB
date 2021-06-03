package co4;

import java.util.Scanner;

public interface co4_q1{
	void input();
	void area();
	}
class rectangle implements co4_q1 {
    int l,w,area;
    Scanner rt=new Scanner(System.in);
	@Override
	public void input() {
		System.out .println("enter the length:");
		l=rt.nextInt();
		System.out.println("enter the width:");
		w=rt.nextInt();
		
	}

	@Override
	public void area() {
		area=l*w;
		System.out.println("Area of the rectangle:"+area);
	
	}
}
class triangle extends rectangle {
    int b,h,area;
    Scanner tr=new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("enter the base:");
		b=tr.nextInt();
		System.out.println("enter the height:");
		h=tr.nextInt();
		
	}

	@Override
	public void area() {
		area=(b*h/2);
		System.out.println("Area of triangle:"+area);
	}

}
class square extends triangle {
    int a,area;
    Scanner sq=new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("enter the side 'a':");
		a=sq.nextInt();
		}

	@Override
	public void area() {
		area=a*a;
		System.out.println("Area of the square:"+area);
	   }
}
 class circle {
	float r;
	double pi=3.14,area;
	Scanner cr=new Scanner(System.in);
	public void input() {
		System.out.println("enter the radius:");
		r=cr.nextFloat();
	}

	public void area() {
		area=pi*r*r;
		System.out.println("Area of the circle:"+area);
	}
  }




 





