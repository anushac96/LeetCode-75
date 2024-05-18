package decodeString;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		DecodeString p  = new DecodeString();
		String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
		System.out.println(p.decodeString(s));
	}
	
	public String decodeString(String s) {
		Stack<Integer> num = new Stack<>();
        Stack<String> alpha = new Stack<>();
        String str ="";
        int k=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                k = (k*10) + s.charAt(i)-'0';
            }else{
                if(s.charAt(i)==']'){
                    while(!alpha.peek().equals("[")){
                        str = alpha.pop()+str;
                    }
                    alpha.pop();
                    str = str.repeat(num.pop());
                    alpha.push(str);
                    str = "";
                }else{
                	if(s.charAt(i)=='[') {
                		num.push(k);
                		k=0;
                	}
                    alpha.push(String.valueOf(s.charAt(i)));
                }
            }
        }
        while(!alpha.isEmpty())
        	str = alpha.pop() + str;
        return str;
    }

}
