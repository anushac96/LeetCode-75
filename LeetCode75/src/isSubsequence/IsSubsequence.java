package isSubsequence;

public class IsSubsequence {

	public static void main(String[] args) {
		IsSubsequence p = new IsSubsequence();
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(p.method(s,t));
	}
	
	public boolean method(String s, String t) {
        int j = 0;
        for(int i =0;i<t.length()&& j<s.length();i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        if(j==s.length())
            return true;
        else 
            return false;
    }

}
