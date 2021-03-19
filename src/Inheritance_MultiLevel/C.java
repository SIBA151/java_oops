package Inheritance_MultiLevel;

public class C extends B{
	int c = 900;
	
	public C() {
		
		System.out.println("C Const");
	}
	public void m3() {
		System.out.println("Method in Class-C");
	}

	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj.a);
		
	}

}
