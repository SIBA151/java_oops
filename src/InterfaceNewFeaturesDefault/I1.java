package InterfaceNewFeaturesDefault;

public interface I1 {
	//non static method for interface
//	public default void m1() {
//		System.out.println("Static Method - I1-m1");
//	}
	
	
	public default void m3() {
		System.out.println("default Method - I1 - m3");
	}

}
