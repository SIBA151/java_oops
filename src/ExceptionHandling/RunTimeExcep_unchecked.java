package ExceptionHandling;

public class RunTimeExcep_unchecked {

	public static void main(String[] args) {
		System.out.println("Start");
		int x= 10;
		int y=0;
		
		try {
			int c=10/0;//jvm/java------->A.E class oblect--java/jvm
//		}catch(Exception e) {
//			//System.out.println(e.getMessage());
//			//e.printStackTrace();
//			System.out.println(e);
//		}
		
		
	    }catch(NullPointerException e) {
	    	e.printStackTrace();
	    }catch(ArithmeticException ae) {
	    	ae.printStackTrace();
	    }catch(Exception np) {
	    	np.printStackTrace();
	    }
		
		
		
		//String type Exception
		try {
			String str = null;
			System.out.println(str.length());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//String type Exception
		
		try {
			int[] arr = {12,34,5,6,7};
			System.out.println(arr[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("End");

	}

}
