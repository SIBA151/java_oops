package ThisKeyword;

public class ThisKeywordBasic {
	int a;
	
	public void nonStaticArea(int a) {
		this.a=a;
		System.out.println(this);
		System.out.println("Value of a in method-"+a);
	}

	public static void main(String[] args) {
		ThisKeywordBasic obj = new ThisKeywordBasic();
		System.out.println(obj);
		
		obj.nonStaticArea(1000);
		System.out.println(obj.a);

	}

}
