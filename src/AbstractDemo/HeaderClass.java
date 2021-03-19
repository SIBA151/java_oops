package AbstractDemo;

public abstract class HeaderClass {
	int a=10;
	abstract public void m1();
	public void m2() {
		System.out.println("m2");
	}
	public static void main(String[] args) {
		AboutUs obj=new AboutUs();
		System.out.println(obj.a);
	}

}
