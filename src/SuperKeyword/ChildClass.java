package SuperKeyword;

public class ChildClass extends ParentClass{
	int a=600;
	
	public ChildClass() {
		super(100);
		System.out.println("Child Class Const");
	}
	
	public void m2() {
		System.out.println("Child Class method "+super.a);
		super.m2();
	}
	
	public static void main(String[] args) {
		ChildClass cc= new ChildClass();
		System.out.println(cc.a);
		cc.m2();
	}

}
