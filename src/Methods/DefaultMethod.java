package Methods;

public class DefaultMethod {
	
	//Instance
	public void userDefinedMethod() {
		System.out.println("Hello Student");
	}
	//static  method
	public static void staticUserDefined() {
		System.out.println("staticUserDefiend Method");
	}

	public static void main(String[] args) {
		System.out.println("Start Execution...");
		DefaultMethod dm = new DefaultMethod();
		dm.userDefinedMethod();
		
		staticUserDefined();
		System.out.println("End Execution...");
	}

}
