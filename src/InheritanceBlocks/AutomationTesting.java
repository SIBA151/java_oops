package InheritanceBlocks;

//Child class
public class AutomationTesting extends ManualTesting {
	static {
		System.out.println("Static Block Child");
	}
	
	{
		System.out.println("Non static Block- Child");
	}

}
