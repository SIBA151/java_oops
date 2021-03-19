package Plymorphism;

public class MethodOverrdingChild extends MethodOverrding{
	public void mOverConcept() {
		super.mOverConcept();
		System.out.println("MethodOverrding- Child");
	}
	public static void staticMethod() {
	//	can not we override static Method
		//super.staticMethod();
		System.out.println("staticMethod-Child");
	}

	public static void main(String[] args) {
		MethodOverrdingChild mc = new MethodOverrdingChild();
		mc.mOverConcept();
		staticMethod();
		MethodOverrding.staticMethod();

	}

}
