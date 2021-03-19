package CollectionConcept;

import java.util.Arrays;

public class RunTimeArgument {

	public static void main(String[] args) {
		int sum=0;
		int[] arr=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int x:arr) {
			sum=sum+x;
		}
		System.out.println(sum);

	}

}
