package Methods;

public class AvgNumbersMainClassMethod {

	public static void main(String[] args) {
		AvgNumbers obj=new AvgNumbers();
		int[] nums= {10,20,30,40,50,60,55,63,71,23};
		double result=obj.avg(nums);
		System.out.println("Avg is - "+result);
		int sum = obj.sum(nums);
		System.out.println("Sum is-"+sum);

	}

}
