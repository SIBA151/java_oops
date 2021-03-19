package InterfaceInheritance_defaultMethods;

public class ClassA implements I2{
	public void m3() {
		m1();
		m2();
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.m1();
		obj.m3();

	}

}
