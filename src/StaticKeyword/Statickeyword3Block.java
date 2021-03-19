package StaticKeyword;

public class Statickeyword3Block {
	
	static int a=1;
	
	static {
		System.out.println("Static Block");
	}
	//Non static block
	{
		System.out.println("Non static Block");
	}

	public static void main(String[] args) {
		

	}

}
