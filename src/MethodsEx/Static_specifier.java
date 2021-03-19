package MethodsEx;

public class Static_specifier {
	static int x;
	
	public void increment() {
		x++;
	}

	public static void main(String[] args) {
		Static_specifier obj1 = new Static_specifier();
		Static_specifier obj2 = new Static_specifier();
		obj1.x=0;
		obj1.increment();
		obj2.increment();
		System.out.println(obj1.x+" "+obj2.x);

	}

}
