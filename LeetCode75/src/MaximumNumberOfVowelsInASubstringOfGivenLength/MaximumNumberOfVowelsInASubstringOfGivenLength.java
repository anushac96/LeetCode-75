package MaximumNumberOfVowelsInASubstringOfGivenLength;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

	public static void main(String[] args) {
		MaximumNumberOfVowelsInASubstringOfGivenLength p = new MaximumNumberOfVowelsInASubstringOfGivenLength();
		
		String s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
		int k = 33;
		
		System.out.println(p.method(s,k));
	}

	public int method(String s, int k) {
		int nums[] = new int[s.length()];
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                nums[i] = ++count;
            }else{
                nums[i] = count;
            }
        }
        int max =0;
        for(int i = s.length()-1;i>k-2;i--){
            if(i-k>-1)
                max = Math.max(max,(nums[i]-nums[i-k]));
            else{
                max = Math.max(max,nums[i]);
            }
        }
        return max;
    }
}
