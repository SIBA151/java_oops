package ConstructorPrivate;

public class MainClass {

	public static void main(String[] args) {
		PrivateConstClass ref = PrivateConstClass.getInstance();
		System.out.println(ref.a);
		ref.nonStaticMethod();

	}

}
