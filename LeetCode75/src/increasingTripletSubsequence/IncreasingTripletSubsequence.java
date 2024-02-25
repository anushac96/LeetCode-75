package increasingTripletSubsequence;

public class IncreasingTripletSubsequence {

	public static void main(String[] args) {
		IncreasingTripletSubsequence p = new IncreasingTripletSubsequence();
		int nums[] = {2,1,5,0,4,6};
		
		//bruteforce
		System.out.println(p.method1(nums));
		
		//optimized with space complexity O(1)
		System.out.println(p.method2(nums));
	}
	
	public boolean method2(int[] nums) {
        int fixedi = Integer.MAX_VALUE;
        int fixedj = Integer.MAX_VALUE;

        for(int i =0;i<nums.length;i++){
            if(nums[i]<=fixedi){
                fixedi = nums[i];
            }else if(nums[i]<=fixedj){
                fixedj= nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
	
	public boolean method1(int[] nums) {
        int min[] = new int[nums.length];
        int max[] = new int[nums.length];
        int len = nums.length;

        min[0] = nums[0];
        for(int i =1;i<len;i++){
            min[i] = Math.min(min[i-1],nums[i]);
        }

        max[len-1] = nums[len-1];
        for(int i =len-2;i>-1;i--){
            max[i] = Math.max(max[i+1],nums[i]);
        }

        for(int i=0;i<len;i++){
            if(nums[i]>min[i] && nums[i]<max[i]){
                return true;
            }
        }
        return false;
    }
}
