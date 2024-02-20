package greatestCommonDivisorofStrings;

public class GreatestCommonDivisorofStrings {

	public static void main(String[] args) {
		String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
		String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
		
		
		
		GreatestCommonDivisorofStrings p = new GreatestCommonDivisorofStrings();
		System.out.println(p.method(str1, str2));
		
	}

	public String method(String str1, String str2) {
		if (str2.length() == 0)
			return str1;
		if(str1==str2) {
            return str1;
		}
		else {
			if (str1.length() < str2.length()) {
				// swap
				str1 = str1 + str2;
				str2 = str1.substring(0, str1.length() - str2.length());
				str1 = str1.substring(str2.length());
			}

			int i = 0;
			for (; i < str2.length();) {
				if (str1.charAt(i) == (str2.charAt(i)))
					i++;
				else
					return "";
			}
			String newStr1 = "";
			for (; i < str1.length(); i++)
				newStr1 = newStr1 + str1.charAt(i);
			return method(str2, newStr1);
		}
	}
}

//test3 commit in git