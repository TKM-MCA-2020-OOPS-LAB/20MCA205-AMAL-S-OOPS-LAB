package myproject;

public class product{
    int pcode;
    String pname;
    int price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        product obj1 = new product();
        product obj2 = new product();
        product obj3 = new product();
        obj1.pcode=233;
        obj1.pname="mask";
        obj1.price=30;
        obj2.pcode=456;
        obj2.pname="sanitizer";
        obj2.price=100;
        obj3.pcode=345;
        obj3.pname="soap";
        obj3.price=25;
        if(obj1.price<obj2.price && obj1.price<obj3.price) {
        	System.out.println("The product with lowest price is :");
        	System.out.println(obj1.pcode+""+obj1.pname+""+obj1.price);
        }
        else if(obj2.price<obj1.price && obj2.price<obj3.price) {
        	System.out.println("The product with lowest price is:");
        	System.out.println(obj2.pcode+""+obj2.pname+""+obj2.price);
        }
        else
        {
        	System.out.println("The product with lowest price is:");
        	System.out.println(obj3.pcode+""+obj3.pname+""+obj3.price);
        }
        
        
	}

}
