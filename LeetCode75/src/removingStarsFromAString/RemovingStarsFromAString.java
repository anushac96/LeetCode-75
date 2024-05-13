package removingStarsFromAString;

import java.util.Stack;

public class RemovingStarsFromAString {

	public static void main(String[] args) {
		RemovingStarsFromAString p  = new RemovingStarsFromAString();
		String s = "erase*****";
		System.out.println(p.removeStars1(s));
		System.out.println(p.removeStars2(s));

	}
	
	// using stack
	public String removeStars1(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch:s.toCharArray()) {
        	if(ch=='*') {
        		if(stack.size()>0)
        			stack.pop();
        	}else {
        		stack.push(ch);
        	}
        }
        String strBuf = "";
        while(!stack.isEmpty()) {
        	strBuf = stack.pop() + strBuf;
        }
        
        return strBuf;
    }
	
	public String removeStars2(String s) {
		String str = "";
        for(int i =0;i<s.length();i++) {
        	if(s.charAt(i)=='*')
        		str = str.substring(0,str.length()-1);
        	else
        		str = str+s.charAt(i);
        }
        return str;
    }

}
