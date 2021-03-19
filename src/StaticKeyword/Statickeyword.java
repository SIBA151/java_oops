package StaticKeyword;

public class Statickeyword {
	static int a=80;

	public static void main(String[] args) {
		Statickeyword ob1=new Statickeyword();
		ob1.a=340;
		System.out.println(a);
		System.out.println("++++++++++++++++++");
		Statickeyword ob2=new Statickeyword();
		ob2.a=460;
		System.out.println(ob1.a);
		System.out.println(ob2.a);

	}

}
