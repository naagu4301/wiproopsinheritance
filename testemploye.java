package wipro_oops.com;

public class testemploye {
	public static void main(String[] args) {
		employee e=new employee("Alice", 1000000, 2010, "01248204");
		System.out.println("Details of Employee:");
		System.out.println("Name: " + e.getName());
		System.out.println("Year Of Starting: " + e.getYearStarted());
		System.out.println("Annual Salary: " + e.getAnnualSalary());
		System.out.println("Insurance Number: " + e.getNationalInsuranceNumber());
	}	
	}
