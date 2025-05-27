
public class EmpGroups extends Employees {  //child class before extends, parent is after extends

	public static void main(String[] args) {

		//Employee Name array
		String[] EmployeeName = new String [4];
		//Employee id array
		int [] EmployeeIDs= new int[4];
		//Parent class object
		Employees emp = new Employees();

		EmployeeName[0] =emp.Employeeone;
		EmployeeName[1] =emp.Employeetwo;
		EmployeeName[2] =emp.Employeethree;
		EmployeeName[3] =emp.Employeefour;

		EmployeeIDs[0] =emp.Employeeone_ID;
		EmployeeIDs[1] =emp.Employeetwo_ID;
		EmployeeIDs[2] =emp.Employeethree_ID;
		EmployeeIDs[2] =emp.Employeefour_ID;

		//print each employee's name along with their corresponding ID.
		System.out.println("Employee Name: " +EmployeeName[0] + ", Employee ID: " + EmployeeIDs[0]);
		System.out.println("Employee Name: " +EmployeeName[1] + ", Employee ID: " + EmployeeIDs[1]);
		System.out.println("Employee Name: " +EmployeeName[2] + ", Employee ID: " +EmployeeIDs[2]);
		System.out.println("Employee Name: " +EmployeeName[3] + ", Employee ID: " +EmployeeIDs[3]);


	}

}
