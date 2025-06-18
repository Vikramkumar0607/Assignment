
public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String word [] =paragraph.split("");
		System.out.println();
		String words ="";
		for(int i =0; i<word.length;i++) {
			System.out.println(word[i]);
			words=words+word[i];
			
			//System.out.println("Count : "+words.indexOf(i));
			
			
		}
		System.out.println("Word: "+words);
		
		
	}

}
