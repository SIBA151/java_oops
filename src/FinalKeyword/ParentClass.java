package FinalKeyword;

public class ParentClass {
	final int a;
//    final static int b;

	public ParentClass(int x) {
		a=x;
	//	b=x;
	}
	
	final public void parentMethod() {
		
		System.out.println("parentMethod");
	
	}
	public static void main(String[] args) {
		ParentClass pc =new ParentClass(100);	
		System.out.println(pc.a);
	}

}
