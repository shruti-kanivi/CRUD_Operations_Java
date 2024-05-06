package crud_operations;

public class EmployeeDB {
	

		private Employee[] emparr;
		private int index=0;
		private int empCount=0;
		
		EmployeeDB(int size){
			emparr = new Employee[size];
		}
		/**
		 * this method is used to add employee details into the database.
		 * @param e should be employee type
		 * @return returns true if added successfully,else returns false.
		 */
		public boolean addEmployee(Employee e)
		{
			if(index < emparr.length) {
				emparr[index++]=e;
				System.out.println("Employee details added to the database Successfully");
				empCount++;
				return true;
				
			}
			else {
				System.out.println("Database if full");
				return false;
			}
		}
		/**
		 * this method prints the all details of Employees
		 */
		public void viewFullDatabase() {
			System.out.println(".....................................................");
			System.out.println("ID\tName\tSalary\tExp\tDesignation\tCompany Name");
			System.out.println(".....................................................");
			
			for(Employee emp : emparr) {
				if(emp!=null) {
					System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp()+"\t"+emp.getDesignation()+"\t"+emp.getCompname());
				}
			}
		}
		/**
		 * this method is used to get total employees in the database
		 * @return index 
		 */
		public int getEmployeeCount() {
			return empCount;
		}
		
		/**
		 * this method is used to search employee based on id,
		 * @param id of the employee to be searched
		 * @return return reference to found employee otherwise returns null.
		 */
		public Employee searchEmployee(int id) {
			Employee e=null;
			for(int i=0;i<emparr.length;i++) {
				if(emparr[i]!=null && emparr[i].getId()==id) {
					System.out.println("Employee found in the databse");
					e = emparr[i];
				}
			}
			if(e==null) {
				System.out.println("Employee is not found in database");
			}
			return e;
		}
		/**
		 * this method is used to update the salary of the employee. If Employee is found in
		 * the database it will update the salary of the employee by the specified amount.
		 * @param id - employee id whose salary has to be updated
		 * @return true  - if update is success
		 * 			false - if update is failed
		 */
		
		public boolean updateSalary(int id,double amount) {
			Employee e=searchEmployee(id);
			if(e!=null) {
				e.setSalary(e.getSalary()+amount);
				System.out.println("Salary Updated");
				return true;
			}
			else {
				System.out.println("Unable to update,check employee id");
				return false;
			}
		}
		/**
		 * this method is used to delete employee details from database
		 * it deletes the complete employee details if the record is found in the database
		 * @param id of the employee to be deleted
		 * @return true if deletion of employee is successful otherwise it returns false
		 */
		
		public boolean deleteEmployee(int id) {
			boolean isDeleted=false;
			for(int i=0;i<emparr.length;i++) {
				if(emparr[i]!=null && emparr[i].getId()==id) {
					System.out.println("Employee found in the databse and deleted");
					
					emparr[i]= null;
					isDeleted=true;
					empCount--;
				}
			}
		
			if( isDeleted==false) {
				System.out.println("Employee not found in database");
			}
			return isDeleted;
		}
	}


