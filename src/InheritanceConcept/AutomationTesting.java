package InheritanceConcept;

public class AutomationTesting extends ManualTesting{
//	child class
	String tool = "Selenium";
	//------1
//	public void regressionTesting() {
//		System.out.println("RegressionTesting");
//		
//		System.out.println(process);
//		functionalTesting();
//	}
	//-------2
	public AutomationTesting(int x) {
		super(100);
		System.out.println("Child Const-AutomationTesting");
	}

}
