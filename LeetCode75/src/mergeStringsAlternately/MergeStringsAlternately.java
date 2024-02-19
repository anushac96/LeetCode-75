package mergeStringsAlternately;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		
		MergeStringsAlternately m = new MergeStringsAlternately();
		
		//bruteforce 
		System.out.println(m.method1("abc","pqr"));
		
		//optimized by code condition check, but time complexcity is same
		System.out.println(m.method2("abc","pqr"));

	}
	
	public String method2(String word1, String word2) {
        String ans = "";
        for(int counter = 0;counter<word1.length() || counter<word2.length();counter++){
            if(counter < word1.length())
                ans = ans + word1.charAt(counter); 
            if(counter < word2.length())
                ans = ans + word2.charAt(counter);
        }
            return ans;
    }
	
	public String method1(String word1, String word2) {
        int counterWord1 = 0;
        int counterWord2 = 0;
        String ans = "";
        for(;counterWord1<word1.length() && counterWord2<word2.length();counterWord1++,counterWord2++){
            ans = ans + word1.charAt(counterWord1);
            ans = ans + word2.charAt(counterWord2);
        }
        if(counterWord1 != word1.length()){
           for(;counterWord1<word1.length();counterWord1++){
            ans = ans + word1.charAt(counterWord1);
            } 
        }else{
            for(;counterWord2<word2.length();counterWord2++){
            ans = ans + word2.charAt(counterWord2);
            }
        }
            return ans;
    }

}
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.

*/