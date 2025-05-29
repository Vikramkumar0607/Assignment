import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Assigment_Collections {

	public static void main(String[] args) {


		//Inside this Assignment Excel There are 3 TestCases with each Testcase having 3 rows of data. 

		//Now, By using collections store all the data into one single variable .

		//and from that variable,  Print the data  Supplier Name > Office Depot  from Product details table.


		System.out.println("**********HashMap************");
		Map<String, String> StudentOne = new TreeMap<String, String>();
		StudentOne.put("Name", "John Doe");
		StudentOne.put("Age", "Twenty");
		StudentOne.put("Gender", "Male");
		StudentOne.put("Roll Number", "SBA12345");
		StudentOne.put("Grade", "A++");
		StudentOne.put("Major", "Computer Science");
		StudentOne.put("GPA", "A3.8");
		StudentOne.put("Email", "john@example.com");
		StudentOne.put("PAN Number", "SDF6543210");
		StudentOne.put("Address", "123 Elm St");


		//Student Two
		Map<String, String> StudentTwo = new TreeMap<String, String>();
		StudentTwo.put("Name", "Jane Smith");
		StudentTwo.put("Age", "Twenty One");
		StudentTwo.put("Gender", "Female");
		StudentTwo.put("Roll Number", "SBA12346");
		StudentTwo.put("Grade", "B+");
		StudentTwo.put("Major", "Mathematics");
		StudentTwo.put("GPA", "A3.5");
		StudentTwo.put("Email", "jane@example.com");
		StudentTwo.put("PAN Number", "REW6543211");
		StudentTwo.put("Address", "456 Oak St");

		//Student Three
		Map<String, String> StudentThree = new TreeMap<String, String>();
		StudentThree.put("Name", "Mike Brown");
		StudentThree.put("Age", "Twenty Two");
		StudentThree.put("Gender", "Male");
		StudentThree.put("Roll Number", "SBA12347");
		StudentThree.put("Grade", "A+");
		StudentThree.put("Major", "Physics");
		StudentThree.put("GPA", "A3.9");
		StudentThree.put("Email", "mike@example.com");
		StudentThree.put("PAN Number", "REW6543212");
		StudentThree.put("Address", "789 Pine St");
		
		List<Map<String, String>> StudentList= new ArrayList<>();
		StudentList.add(StudentOne);
		StudentList.add(StudentTwo);
		StudentList.add(StudentThree);
		


	}

}
