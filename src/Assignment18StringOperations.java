
public class Assignment18StringOperations {


	public static boolean isPalindrome(String str) {
		//StringBuilder ==> StringBuilder is mutable class ==> Non-synchronized
		String reversedStr = new StringBuilder(str).reverse().toString();
		System.out.println(reversedStr);
		return str.equalsIgnoreCase(reversedStr);

	}

	public static void main(String[] args) {
		// Initialize a String
		String S1 = "A man, a plan, a canal: Panama";
		
		//Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		//converting uppercase letters into lowercase letters from the String ==> String.toLowerCase();
		String s1= S1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		//Reverse String after removing the all 
		
		//Remove all alphabets from the String ==> String.replaceAll(regExp,newChar);
		//converting uppercase letters into lowercase letters from the String ==> String.toLowerCase();
		String S2 = "race a car";
		String s2 =S2.replaceAll("[^a-zA-Z]", "").toLowerCase();
//
		System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
		System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));

		System.out.println("*****************************************************");
		 System.out.println("Used for loop using with lowercase string length and compared");
		  String reverseSentence = "";
		  for(int i = s1.length()-1 ; i>=0;i--) {
			  reverseSentence =reverseSentence+s1.charAt(i);
		  
		 } System.out.println("Reverse Sentence is: " + reverseSentence);
		 
		  if(s1.equals(reverseSentence)) {
			  System.out.println(s1 + " is a palindrome: "  +reverseSentence); 
			  } 
		  else { System.out.println(s1 + " is a not palindrome: " +reverseSentence); }
		 
		  
		  System.out.println("*****************************************************");
		  System.out.println("while statement used for palindrome");
         int i =0;
         int j =s1.length()-1;

         while(i<=j) {
        	 if(s1.charAt(i)!=s1.charAt(j)) {
        		 System.out.println(S1 + " is  anot  palindrome: " );
        		 break;
        	 }
        	i++;
        	j--;
        	 
         }
         
    	 System.out.println(S1 + " is a palidrome : "+ s1);

	}

}
