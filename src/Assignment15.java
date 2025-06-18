import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
		String finalvalue="";
		for(int j =0; j<values.length;j++) {
			finalvalue = finalvalue+Character.toUpperCase(values[j].charAt(0))+values[j].substring(1)+" ";
			
		}
		System.out.println(finalvalue);
		

	}

}
