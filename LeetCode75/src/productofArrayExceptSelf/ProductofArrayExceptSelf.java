package productofArrayExceptSelf;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		ProductofArrayExceptSelf p = new ProductofArrayExceptSelf();
		int a[] = {1,2,3,4};
		
		//bruteforce
		int method1Ans[] = p.method1(a);
		
		System.out.println((Arrays.toString(method1Ans)));
		
		//optimised and space complexity
		int method2Ans[] = p.method2(a);
				
		System.out.println((Arrays.toString(method2Ans)));

	}
	
	public int[] method2(int[] nums) {
        int num = nums[nums.length-1];
        int ans[] = new int[nums.length];
        ans[nums.length-1] = 1;
        for(int i =nums.length-2;i>-1;i--){
            ans[i] = num*ans[i+1];
            num = nums[i];
        }
        //num=nums[0];
        //ans[0] = ans[0] * num;
        for(int i =1;i<nums.length;i++){
            ans[i] = num*ans[i];
            num = num * nums[i];
        }
        return ans;
    }
	
	public int[] method1(int[] nums) {
        int pre[] = new int[nums.length];
        int post[] = new int[nums.length];
        int len = nums.length;
        pre[0] = 1;
        post[len-1] = 1;

        int preInt = 1;
        int postInt = 1;
        for(int i =1;i<len;i++){
            pre[i] = preInt*nums[i-1];
            preInt = pre[i];
        }
        for(int i =len-2;i>=0;i--){
            post[i] = postInt*nums[i+1];
            postInt = post[i];
        }
        int ans[] = new int[len];
        for(int i =0;i<len;i++){
            ans[i] = pre[i]*post[i];
        }
        return ans;
    }

}
