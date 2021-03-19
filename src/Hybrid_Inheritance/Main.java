package Hybrid_Inheritance;

public class Main {
	public void mainClassMethod() {
		
	}
	public static void main(String[] args) {
		ClassC aObj=new ClassC();
		I1.m2();
		I2.b();
		aObj.absMethod();
		aObj.m3();
		aObj.c();
		
		ClassB bObj = new ClassB();
		bObj.absMethod();
		bObj.m3();
		bObj.c();
		
		
	}

}
