package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws UserDefinedException {
		String str = "Exception Handling";
		try {
			if(str.length()>10) {
				throw new UserDefinedException("Length of string should n't be more than 10");
			}
			}catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
		
//		String str = null;
//		try {
//			if(str==null) {
//				throw new NullPointerException("Can't count the length of null");
//			}
//		}catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		}

	}


