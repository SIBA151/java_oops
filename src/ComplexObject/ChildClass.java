package ComplexObject;

public class ChildClass extends ParentClass {
	int a=100;
	int c=23;
	public void childMethod() {
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		ParentClass obj=new ChildClass();
		System.out.println(obj.a);
//       	System.out.println(obj.c);
		
		obj.parentMethod();
//		obj.childMethod();

	}

}
