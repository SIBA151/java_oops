package InheritanceBlocks;

public class ManualTesting {
	static {
		System.out.println("Static Block-Parent");
	}
	{
		System.out.println("Non static Block Parent");
	}
	public ManualTesting() {
		System.out.println("Parent - Constructor");
	}

}
