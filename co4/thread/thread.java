public class thread extends Thread{
	public void run() {
		System.out.println("HELLO WORLD");
		}

	public static void main(String[] args) {
		thread n=new thread();
		n.start();
		System.out.println("getstate1: "+n.getState());
		System.out.println(" thread priority : " + n.getPriority());
	    System.out.println("Id of n: "+n.getId());
	    System.out.println("Running thread name: "+ Thread.currentThread().getName());  
		n.setName("try"); 
	    System.out.println("After changing name of n: "+n.getName());  
		System.out.println("is the thread alive: "+n.isAlive());
		
	}

}
