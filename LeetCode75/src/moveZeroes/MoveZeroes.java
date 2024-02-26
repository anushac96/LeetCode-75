package moveZeroes;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes p = new MoveZeroes();
		int nums[] = {0,1,0,3,12};
		
		System.out.println(Arrays.toString(p.method(nums)));

	}
	
	public int[] method(int[] nums) {
        int zeroIndex = -1;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0 && zeroIndex >-1){
                nums[zeroIndex] = nums[i];
                    nums[i] = 0;
                    zeroIndex++;
            }else if(zeroIndex==-1 && nums[i]==0){
                zeroIndex = i;
            }
        }
        return nums;
    }

}
