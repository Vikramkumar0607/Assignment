
public class Assignment18StringOperations {


	public static boolean isPalindrome(String str) {
		String reversedStr = new StringBuilder(str).reverse().toString();
		System.out.println(str);
		return str.equalsIgnoreCase(reversedStr);

	}

	public static void main(String[] args) {
		// Initialize a String
		String S1 = "A man, a plan, a canal: Panama";
		
		//Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		//converting uppercase letters into lowercase letters from the String ==> String.toLowerCase();
		String s1= S1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		
		//Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		//converting uppercase letters into lowercase letters from the String ==> String.toLowerCase();
		String S2 = "race a car";
		String s2 =S2.replaceAll("[^a-zA-Z]", "").toLowerCase();
//
		System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
		System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));




	}

}
