package Methods;

public class PassObjectAsParam {
	public void m1(PassObjectAsParam ob) {
		System.out.println("m1 method-"+ob);
	}

	public static void main(String[] args) {
		PassObjectAsParam ob = new PassObjectAsParam();
		System.out.println("main method-"+ob);
		ob.m1(ob);

	}

}
