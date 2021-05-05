package myproject;

public class CPU_nested_class 
{
	int price = 50000;
	public class processor
	{
		int cores = 4;
		String manufacturer = "intel";
	}
	
	  static class ram
	{
		int memory = 16;
		String manufacturer = "intel";
		
	}

	


    public static void main(String[] args) {
 
		CPU_nested_class obj1 = new CPU_nested_class();
		CPU_nested_class.processor obj2 = obj1.new processor();
		CPU_nested_class.ram obj3 = new CPU_nested_class.ram();
		
		System.out.println("Price= " +obj1.price);
		System.out.println("Number of cores= " +obj2.cores);
		System.out.println("Processor Manufacturer= " +obj2.manufacturer);
		System.out.println("Memory = " +obj3.memory);
		System.out.println("RAM Manufacturer = " +obj3.manufacturer);
		
		// TODO Auto-generated method stub

	}

 }
