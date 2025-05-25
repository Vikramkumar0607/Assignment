
public class Assignment_Arrays {

	public static void main(String[] args) {
		
		//Array data type can store multiple values with similar  data type together at one place
		
		//Syntax to initialize  array : DataType [] variable ={value1 ,value2,value3};
		//1D Array Semester
		String[] Semester = {"sem1","sem2","sem3","sem4","sem5"};
		String[] sem1_subjects= {"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing", "Basic Electrical Eng."};
		String[] Sem1_passmarks= {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)","Pass(79)"};
		String[] sem2_subjects= {"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics", "Engineering Graphics"};
		String[] Sem2_passmarks= {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)","Pass(90)"};
		String[] sem3_subjects= {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems", "Object-Oriented Prog."};
		String[] Sem3_passmarks= {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)","Pass(78)"};
		String[] sem4_subjects= {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.", "Software Engineering"};
		String[] Sem4_passmarks= {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)","Pass(87)"};
		String[] sem5_subjects= {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems", "Computer Graphics"};
		
		
		//1D array output
		System.out.println("Semester 2 Subject name is "+ sem2_subjects[4]);
		System.out.println("Semester 2 Subject name is "+ sem2_subjects[5]);
		
		//Subjects and Status/Marks as the second dimension. 
		String[][] sem4= {sem4_subjects,Sem4_passmarks};
		
		//2D arr
		System.out.println("Semester 4 Subject 3 name is " + sem4[0][3] + " status and marks " + sem4[1][3]);
		System.out.println("Semester 4 Subject 6 name is " + sem4[0][5] + " status and marks " + sem4[1][5]);
		
		
		
		
		
		
		
		
	}

}
