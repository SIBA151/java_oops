package VariablesType;

public class InstanceVariable {
//	int a;
	int a=100;
	
	//Non static method
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2= new InstanceVariable();
		InstanceVariable obj3 = new InstanceVariable();
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		
		obj.a=1400;
		
		System.out.println("=====================");
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
	}

}
