package Hybrid_Inheritance;

public interface I2 {
	public void a();
	
	public static void b() {
		System.out.println("I2- Static Method");
	}
	public default void c() {
		System.out.println("I2- Non Static Method");
	}
	public static void main(String[] args) {
		b();
	}

}
