package ThisKeyword;

public class ThisExample {
	public ThisExample() {
		System.out.println("Const");
	}
	public void ThisExample() {
		
		System.out.println("Method");
	}

	public static void main(String[] args) {
		ThisExample obj = new ThisExample();
		obj.ThisExample();

	}

}
