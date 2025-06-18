import java.util.Iterator;

public class Assignment15 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		
		//Count the total number of words in the sentence.
		System.out.println(sentence.length());
		
		//Print the sentence words in reverse order.
		String reverseSentence ="";
		for(int i = sentence.length()-1 ; i>=0;i--) {
			
			reverseSentence =reverseSentence +sentence.charAt(i);
		}
		System.out.println(reverseSentence);
		
		//Convert the first character of each word to uppercase and print original sentence
		
		String [] values = sentence.split(" ");
		StringBuilder titleCaseSentence = new StringBuilder();
		for(String value : values) {
			if(sentence.length()>0) {
				String capitalizedWord = value.substring(0, 1).toUpperCase() + value.substring(1);
                titleCaseSentence.append(capitalizedWord).append(" ");
			}
			
		}
		System.out.println("Title Case Sentence: " + titleCaseSentence.toString().trim());		

	}

}
