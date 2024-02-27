package maximumAverageSubarrayOne;

public class MaximumAverageSubarrayOne {

	public static void main(String[] args) {
		MaximumAverageSubarrayOne p = new MaximumAverageSubarrayOne();
		int nums[] = {7,4,5,8,8,3,9,8,7,6};
		int k = 7;
		System.out.println(p.method1(nums,k));
	}
	
	public double method1(int[] nums, int k) {
		double res = 0;
        for(int i =0;i<k;i++){
            res = res+nums[i];
        }
        double max = res;

        for(int i = k;i<nums.length;i++){
            res = (res - nums[i-k] + nums[i]);
            max = Math.max(max,res);
        }
        return max/k;
    }

}
