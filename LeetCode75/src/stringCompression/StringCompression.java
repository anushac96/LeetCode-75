package stringCompression;

public class StringCompression {

	public static void main(String[] args) {
		
		StringCompression p = new StringCompression();
		char chars[] = {'a','a','b','b','c','c','c'};
		System.out.println(p.method1(chars));

	}
	
	public int method1(char[] chars) {
        int count = 0;
        int index = 0;

        for(int i=0;i<chars.length;){
            char a = chars[i];
            while(i<chars.length && chars[i]==a){
                count++;
                i++;
            }
            if(count>1){
                chars[index++] = a;
                String countString = Integer.toString(count);
                for(int j =0;j<countString.length();j++)
                    chars[index++] = countString.charAt(j);
            }else{
                chars[index++] = a;
            }
            count = 0;
        }
        return index;
    }
}
