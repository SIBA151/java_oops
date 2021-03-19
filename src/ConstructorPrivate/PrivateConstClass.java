package ConstructorPrivate;

public class PrivateConstClass {
	int a = 100;
	
	private PrivateConstClass() {
		System.out.println("private Const");
	}
	public void nonStaticMethod() {
		System.out.println("nonStaticMethod");
	}
	public static PrivateConstClass getInstance() {
		PrivateConstClass obj = new PrivateConstClass();
		return obj;
	}

}
