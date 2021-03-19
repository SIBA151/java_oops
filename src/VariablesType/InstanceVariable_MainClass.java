package VariablesType;

public class InstanceVariable_MainClass {
	//non static method
	public void mainClassMethod() {
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.a);
		System.out.println(StaticVariable.a);
	}

	public static void main(String[] args) {
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.a);
		System.out.println(StaticVariable.a);

	}

}
