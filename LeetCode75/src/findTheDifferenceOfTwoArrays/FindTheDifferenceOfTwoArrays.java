package findTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

	public static void main(String[] args) {
		FindTheDifferenceOfTwoArrays p = new FindTheDifferenceOfTwoArrays();
		int nums1[] = {1,2,3};
		int nums2[] = {2,4,6};
		
		List<List<Integer>> blist = p.findDifference(nums1, nums2);
		System.out.println(Arrays.toString(blist.toArray()));
		

	}
	
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> blist = new ArrayList<List<Integer>>();
        Set<Integer> ans1 = new HashSet<>();
        Set<Integer> ans2 = new HashSet<>();

        //answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
        for (int i = 0; i < nums2.length; i++) {
            if (!set.contains(nums2[i])) {
                set.add(nums2[i]);
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])){
                ans1.add(nums1[i]);
            }
        }

        set.clear();
        blist.add(new ArrayList<>(ans1));
        
        // answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
        for (int i = 0; i < nums1.length; i++) {
            if (!set.contains(nums1[i])) {
                set.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!set.contains(nums2[i])) {
                ans2.add(nums2[i]);
            }
        }
        blist.add(new ArrayList<>(ans2));
        return blist;
    }

}
