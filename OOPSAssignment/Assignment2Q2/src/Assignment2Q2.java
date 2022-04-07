import java.util.ArrayList;

public class Assignment2Q2 {
	 int salary = 10000;
	    public int getSalary(int salary){
	    	this.salary=salary;
	    	return salary;
	    	
	    }
	    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
	    	int totalsal=0;
	    	for(Integer sal:employeeSalaries) {
	    		totalsal+=sal;
	    		
	    	}
			return totalsal;
	    	
	    }
	    public static void main(String[] args) {
	    	Assignment2Q2 employee = new Assignment2Q2();
	    	Manager managersalary = new Manager();
	    	int managersal= managersalary.getSalary(employee.salary);
	    	System.out.println(managersal);
	    	Labour laboursalary = new Labour();
	    	int laboursal =laboursalary.getSalary(employee.salary);
	    	System.out.println(laboursal);
	    	ArrayList<Integer> employeeSalaries = new ArrayList<>();
	    	employeeSalaries.add(managersal);
	    	employeeSalaries.add(laboursal);
	    	  System.out.println("Total Salaries Of All Employees =>"+employee.totalEmployeesSalary(employeeSalaries));
	    	
	    	
	    }

}
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
    	this.salary=salary;
        int incentive = 5000;
        return salary+incentive;
    }
}
class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
    	this.salary=salary;
        int overtime = 500;
		return salary+overtime;
    }
}
