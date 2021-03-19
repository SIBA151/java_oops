package Methods;

public class PassAnArrayAsParam {
	public static void sumArrElmns(int[] arr) {
		int sum=0;
//		for(int val:arr) {
//			sum=sum+val;
//		}
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] arr=new int[] {12,55,56,89,82};
		sumArrElmns(arr);

	}

}
