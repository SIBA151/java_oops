package InterfaceInheritance;

public class ClassA implements I2{
	
	public void m2() {
		System.out.println("I2-m2");
	}
	public void m1() {
		System.out.println("I1-m1");
	}
	public void m3() {
		System.out.println("I1-m3");
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.m1();
		obj.m2();
		obj.m3();
		
		System.out.println(I2.a);
		System.out.println(I1.a);
	    System.out.println(I2.b);
	}

}
