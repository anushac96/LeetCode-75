package findPivotIndex;

public class FindPivotIndex {

	public static void main(String[] args) {
		FindPivotIndex p = new FindPivotIndex();
		int nums[] = {1,7,3,6,5,6};
		System.out.println(p.pivotIndex(nums));

	}
	
	public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }

        for(int i = 0;i<nums.length;i++){
            if(i!=0){
                leftSum+=nums[i-1];
            }
            int rightSum = totalSum - nums[i]-leftSum;
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }

}
