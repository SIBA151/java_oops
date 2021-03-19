package InterfaceInheritance_defaultMethods;

public interface I2 extends I1{
	public default void m1() {
		I1.super.m1();
		System.out.println("m1 - default- I2");
	}

}
