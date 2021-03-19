package InheritanceConstOverloading;

public class ChildClass extends ParentClass{
	public ChildClass() {
		super(100);
		System.out.println("Child Class Const- default");
	}

	public static void main(String[] args) {
		ChildClass ob=new ChildClass();

	}

}
