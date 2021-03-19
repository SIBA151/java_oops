package Methods;

public class AvgNumbers {
	public int sum(int[] numsArr) {
		int sum=0;
		for(int i=0;i<numsArr.length;i++) {
			sum+=numsArr[i];
		}
		return sum;
	}
	public int avg(int[] arrNums) {
		int elm_count=arrNums.length;
		int sum_nums=sum(arrNums);
		int avg=sum_nums/elm_count;
		return avg;
	}

	public static void main(String[] args) {
		AvgNumbers obj=new AvgNumbers();
		int[] nums= {10,20,30,40,50,60,55,63,71,23};
		int res=obj.avg(nums);
		System.out.println(res);

	}

}
