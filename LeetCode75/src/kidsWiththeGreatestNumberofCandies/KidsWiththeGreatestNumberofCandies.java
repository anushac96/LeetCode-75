package kidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		KidsWiththeGreatestNumberofCandies p = new KidsWiththeGreatestNumberofCandies();
		
		// bruteforce
		p.method1(candies, extraCandies);
		
		//little optimized no need to add and check
		p.method2(candies, extraCandies);

	}
	public List<Boolean> method2(int[] candies, int extraCandies) {
		int max = 0;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>max)
                max = candies[i];
        }
        List<Boolean> result = new ArrayList<>();
        for(int i =0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
	}
	
	public List<Boolean> method1(int[] candies, int extraCandies) {
		int max = 0;
        for(int i =0;i<candies.length;i++){
            if(candies[i]>max)
                max = candies[i];
        }
        List<Boolean> result = new ArrayList<>();
        for(int i =0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
	}

}
