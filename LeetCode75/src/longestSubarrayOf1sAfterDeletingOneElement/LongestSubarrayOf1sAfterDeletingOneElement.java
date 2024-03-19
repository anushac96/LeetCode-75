package longestSubarrayOf1sAfterDeletingOneElement;

public class LongestSubarrayOf1sAfterDeletingOneElement {

	public static void main(String[] args) {
		LongestSubarrayOf1sAfterDeletingOneElement p = new LongestSubarrayOf1sAfterDeletingOneElement();
		int nums[] = {1,1,0,1};
		System.out.println(p.longestSubarray(nums));
		

	}
	
	public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int maxCount = 0;
        int countOne = 0;
        int countZero = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                countOne++;
                i++;
            } else {
                if (countZero < 1) {
                    countZero++;
                    i++;
                } else {
                    maxCount = Math.max(maxCount, countOne);
                    if (nums[j] == 1) {
                        countOne--;
                        j++;
                    }else{
                        countZero--;
                        j++;
                    }
                }
            }
        }
        maxCount = Math.max(maxCount, countOne);
        if(countZero==0)
            return maxCount-1;
        else
            return maxCount;
    }

}
