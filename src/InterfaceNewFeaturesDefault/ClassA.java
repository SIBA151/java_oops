package InterfaceNewFeaturesDefault;

public class ClassA implements I1,I2{
	
	
//	public void m3() {
//		
//		m2();
//		m1();
//		//or
//		I1.super.m1();
//		I2.super.m2();
//	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
//		obj.m3();
//		obj.m2();
		obj.m3();
		
	}
	@Override
	public void m3() {
		I1.super.m3();
		I2.super.m3();
	}

}
