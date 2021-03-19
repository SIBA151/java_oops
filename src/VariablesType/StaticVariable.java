package VariablesType;

public class StaticVariable {
	static int a=100;
	
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		StaticVariable obj=new StaticVariable();
		StaticVariable obj1=new StaticVariable();
		StaticVariable obj2=new StaticVariable();
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("================");
		obj1.a=200;
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj.m1();

	}

}
