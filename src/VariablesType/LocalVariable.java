package VariablesType;

public class LocalVariable {
	static LocalVariable obj;
	
	public static void main(String[] args) {
		obj=new LocalVariable();
		
		System.out.println(obj);
		int a=0;
		System.out.println(a);
		System.out.println(obj);

	}

}
