package uniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {

	public static void main(String[] args) {
		UniqueNumberOfOccurrences p = new UniqueNumberOfOccurrences();
		int arr[] = {1,2,2,1,1,3};
		System.out.println(p.uniqueOccurrences(arr));
	}
	
	public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (Integer url : map.values()){
            if(set.contains(url))
                return false;
            else
                set.add(url);
        }
        return true;
    }

}
