package reverseVowelsofaString;

public class ReverseVowelsofaString {

	public static void main(String[] args) {
		ReverseVowelsofaString p = new ReverseVowelsofaString();
		String s = "Hello";
		System.out.println(p.method(s));
	}
	
	public String method(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] ch = s.toCharArray();
        while (start < end) {
            if (!(ch[start] == 'a' || ch[start] == 'e' || ch[start] == 'i' || ch[start] == 'o' || ch[start] == 'u'
                    || ch[start] == 'A' || ch[start] == 'E' || ch[start] == 'I' || ch[start] == 'O'
                    || ch[start] == 'U')) {
                start++;
            } else if (!(ch[end] == 'a' || ch[end] == 'e' || ch[end] == 'i' || ch[end] == 'o' || ch[end] == 'u'
                    || ch[end] == 'A' || ch[end] == 'E' || ch[end] == 'I' || ch[end] == 'O' || ch[end] == 'U')) {
                end--;
            } else {
                // Swapping using XOR operation
                ch[start] = (char) (ch[start] ^ ch[end]);
                ch[end] = (char) (ch[start] ^ ch[end]);
                ch[start] = (char) (ch[start] ^ ch[end]);
                start++;
                end--;
            }
        }
        StringBuilder sbf = new StringBuilder(""); 

        return sbf.append(ch).toString();
    }

}
