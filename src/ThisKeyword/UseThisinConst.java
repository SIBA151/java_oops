package ThisKeyword;

public class UseThisinConst {
	public UseThisinConst() {
		System.out.println("Deafult Const.");
	} 
	public UseThisinConst(int x) {
		this();
		
		System.out.println("parems const.-"+x);
	}

	public static void main(String[] args) {
		UseThisinConst obj = new UseThisinConst(456);
	}

}
