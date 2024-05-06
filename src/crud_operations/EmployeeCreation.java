package crud_operations;

public class EmployeeCreation {
private static int randum=1001;
	
	public Employee createEmployee(String name,double salary,double exp,String designation,String compname) {
		Employee e= new Employee(randum++, name, salary, exp, designation, compname);
		return e;
	}
}
