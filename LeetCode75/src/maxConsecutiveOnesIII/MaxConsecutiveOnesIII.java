package maxConsecutiveOnesIII;

public class MaxConsecutiveOnesIII {

	public static void main(String[] args) {
		MaxConsecutiveOnesIII p = new MaxConsecutiveOnesIII();
		int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(p.longestOnes(nums, k));
		

	}
	
	public int longestOnes(int[] nums, int k) {
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
                if (countZero < k) {
                    countZero++;
                    i++;
                } else {
                    maxCount = Math.max(maxCount, countOne + countZero);
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
        maxCount = Math.max(maxCount, countOne + countZero);
        return maxCount;
    }

}
