
public class Assignment16 {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String word [] =paragraph.split("");
		String words ="";
		for(int i =0; i<=word.length;i++) {
			words=words+word[i];
			
			System.out.println("Word: "+word);
			System.out.println("Count : "+words.indexOf(i));
			
			
		}
		
		
	}

}
