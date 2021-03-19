package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		//one
//		try {
//			int x= 10/10;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("Finally block");
//		}
		
		//two
		try {
			int x = 10/0;
		}finally {
			System.out.println("Finall Block");
		}
		System.out.println("test");

	}

}
