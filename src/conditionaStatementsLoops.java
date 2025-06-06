import java.util.HashMap;
import java.util.Map;

public class conditionaStatementsLoops {
	//Assignment -9 (Conditional Statements & Loops)
	public static void main(String[] args) {
		//Employee Names
		String[] employees = {"Alice Johnson","Bob Smith","Carol Davis","David Brown","Eva Green"};
		//Employee Base salary,Experience, Year End Rating
		double[] emp1Data= {75000.0,5.1,4.2};
		double[] emp2Data= {68000.0,3.2,3.8};
		double[] emp3Data= {82000.0,7.1,4.5};
		double[] emp4Data= {90000.0,10.2,2.5};
		double[] emp5Data= {60000.0,2.4,3.5};
		//Store Empy data in map

		Map<String, double[]> empData =new HashMap<>();
		empData.put(employees[0], emp1Data);
		empData.put(employees[1], emp2Data);
		empData.put(employees[2], emp3Data);
		empData.put(employees[3], emp4Data);
		empData.put(employees[4], emp5Data);
		
		Map<String,Double>hikeMap = new HashMap<>();
		for(String emp :employees) {
			double[] data =empData.get(emp);
			double  baseSalary =data[0];
			double experience =data[1];
			
		}
	


	}

}
