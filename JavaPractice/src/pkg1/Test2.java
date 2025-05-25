package pkg1;

public abstract class Test2 {
	
	int b=200;//instance
	static int c=300;//static
	
	public void abc() {
		int a=100;//local 
		System.out.println(c);
		System.out.println("I am abc method");
	}
	
	public void abcd() {
		
		System.out.println("I am abcd method");
	}
	public static void pqr() {
		System.out.println(c);
		System.out.println("I am static pqr method");
	}
	
	public static void main() {
		System.out.println("1234");
	}

	public static void main(String[] args) {
		
	
		
	}

	

	

}
