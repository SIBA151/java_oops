package ConstructorConcept;

public class ConstOverloading {
	public ConstOverloading(int x,String y) {
		System.out.println("int x,String y");
	}
	public ConstOverloading(String y,int x) {
		System.out.println("String y,int x");
	}
	public ConstOverloading(String y) {
		System.out.println("String y");
	}
	public ConstOverloading(int x) {
		System.out.println("int x");
	}

	public static void main(String[] args) {
		ConstOverloading obj=new ConstOverloading(100);
		ConstOverloading obj1=new ConstOverloading(100,"ABC");
		ConstOverloading obj2=new ConstOverloading("ABC",100);
		ConstOverloading obj3=new ConstOverloading("Abc");

	}

}
