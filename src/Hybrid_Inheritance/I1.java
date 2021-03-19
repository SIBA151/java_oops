package Hybrid_Inheritance;

public interface I1 {
	public void m1();
	
	public static void m2() {
		System.out.println("I1-static Method ");
	}
	public default void m3() {
		System.out.println("I1- Non Static Method");
	}

}
