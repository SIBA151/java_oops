package ExceptionHandling;

public class UserDefinedException extends Exception{
	String msg;
	public UserDefinedException(String msg) {
		super(msg);
	}
	
//	public void printErrMsg() {
//		System.out.println(msg);
//	}

}
