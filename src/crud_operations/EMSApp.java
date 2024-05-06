package crud_operations;

public class EMSApp {
	public static void main(String[] args) {
		System.out.println("................................");
		
		EmployeeCreation ec=new EmployeeCreation();
		Employee e1=ec.createEmployee("Ramesh", 50000, 3, "SSE", "BY");
		Employee e2=ec.createEmployee("Manju", 55000, 7, "SSE", "BY");
		Employee e3=ec.createEmployee("Rajaram", 55000, 9, "SSE", "TCS");
		Employee e4=ec.createEmployee("Rahul", 52000, 3, "SSE", "Infosys");
		Employee e5=ec.createEmployee("Ram", 70000, 2, "SSE", "WIPRO");
		
		
		//creating Employee database of capacity 10
		EmployeeDB eDB = new EmployeeDB(10);
		//storing employee in database
		eDB.addEmployee(e1);
		eDB.addEmployee(e2);
		eDB.addEmployee(e3);
		eDB.addEmployee(e4);
		eDB.addEmployee(e5);
		
		
		
		
		System.out.println("................................");
		System.out.println("Total Employee :"+eDB.getEmployeeCount());
		eDB.viewFullDatabase();
		System.out.println();
		
		Employee e = eDB.searchEmployee(1005);
		System.out.println(e.getId()+""+e.getName());
		eDB.updateSalary(1003, 5000.00);
		eDB.viewFullDatabase();
		eDB.deleteEmployee(1003);
		eDB.viewFullDatabase();
		System.out.println("Total Employee"+eDB.getEmployeeCount());
		
		System.out.println("......................................");
	}
}
