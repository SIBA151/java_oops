package VariablesType;

public class VariableExercise {
	int a;
	static int b=10;

	public static void main(String[] args) {
		int a=90;
		VariableExercise obj=new  VariableExercise();
		VariableExercise obj1=new  VariableExercise();
		VariableExercise obj2=new  VariableExercise();
		
		System.out.println(obj.a);
		System.out.println(a);
		obj2.b=900;
		a=800;
		obj2.a=8000;
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj1.b);
		System.out.println(obj.b);
		System.out.println(obj2.b);
		System.out.println(a);

	}

}
