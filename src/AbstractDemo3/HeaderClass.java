package AbstractDemo3;

public abstract class HeaderClass {
	String appTitle="MyApplication";
	public HeaderClass() {
		System.out.println("HeaderClass Const");
	}
	abstract public void bannerSlider();
	
	public void headerMenu() {
		System.out.println("headerMenu-HeaderClass");
	}

}
