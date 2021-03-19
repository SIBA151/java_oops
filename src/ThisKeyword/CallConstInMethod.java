package ThisKeyword;

public class CallConstInMethod {
	public void CallConstInMethod() {
		System.out.println("Method");
	}
	public CallConstInMethod() {
		CallConstInMethod();
		System.out.println("Const");
	}
	public void m1() {
		CallConstInMethod ob = new CallConstInMethod();
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		CallConstInMethod obj = new CallConstInMethod();
		obj.m1();

	}

}
