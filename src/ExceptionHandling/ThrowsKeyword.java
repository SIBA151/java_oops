package ExceptionHandling;

import java.io.FileInputStream;


public class ThrowsKeyword {

	
	    public static void m1() throws Exception {
		System.out.println("Start");
		System.out.println("Stmt1");
		System.out.println("Stmt2");
		System.out.println("Stmt3");
		
		Thread.sleep(2000);
		FileInputStream file = new FileInputStream("D:\\test.java");
		
		System.out.println("Stmt4");
		System.out.println("Stmt5");
		
	    }
	    public static void main(String[] args) throws Exception {
	    	m1();

	}

}
