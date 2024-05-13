package determineIfTwoStringsAreClose;

import java.util.HashMap;

public class DetermineIfTwoStringsAreClose {

	public static void main(String[] args) {
		DetermineIfTwoStringsAreClose p = new DetermineIfTwoStringsAreClose();
		String word1 = "abbzzca";
		String word2 = "babzzcz";
		System.out.println(p.closeStrings(word1, word2));

	}
	
	public boolean closeStrings(String word1, String word2) {
		if(word1.length()!=word2.length())
            return false;
        else{
            int a1[] = new int[26];
            int a2[] = new int[26];
            for(int i =0;i<word1.length();i++){
                a1[word1.charAt(i)-'a']++;
                a2[word2.charAt(i)-'a']++;
            }
            for(int i =0;i<a1.length;i++){
                if((a1[i]==0 && a2[i]!=0) || (a2[i]==0 && a1[i]!=0))
                    return false;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:a1){
                if(i>0){
                    map.put(i,map.getOrDefault(i,0)+1);
                }
            }
            for(int i:a2){
                if(i>0){
                    if(!map.containsKey(i))
                        return false;
                    map.put(i,map.get(i)-1);
                    if(map.get(i)==0)
                        map.remove(i);
                }
            }
            return map.size()==0;
        }
    }

}
