package ExceptionHandling;

public class MyException2 {

	public static void main(String[] args) {
		int a=17;
		try {
			if(a<18) {
				throw new MyException("you not eligible for voting");
			}
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
