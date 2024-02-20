package reverseWordsinaString;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		ReverseWordsinaString p = new ReverseWordsinaString();
		String str = "hello world";
		
		// bruteforce
		System.out.println(p.method(str));
	}
	
	public String method(String s) {
        String temp = "";
        String s1 = "";

        for(int i =0;i<s.length();i++){
            if(!((s.charAt(i))==' ')){
                temp+=s.charAt(i);
            }else if(temp.length()>0){
                s1 = ' '+temp+s1;
                temp = "";
            }
        }
        if(temp.length()>0)
            s1 = ' '+temp+s1;
        return s1.substring(1);
    }

}
