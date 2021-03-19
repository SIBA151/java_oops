package InheritanceConstOverloading;

public class ParentClass {
	public ParentClass() {
		System.out.println("Parent Const-default");
	}
	
	public ParentClass(int x) {
		this();
		System.out.println("parent Conct-"+x);
	}
		

}
