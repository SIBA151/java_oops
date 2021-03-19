package InterfaceInheritance_defaultMethods;

public interface I1 {
	public default void m1() {
		System.out.println("m1- default - I1");
	}
	public default void m2() {
		System.out.println("m2 - default- I1");
	}

}
