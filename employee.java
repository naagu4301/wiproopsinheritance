package wipro_oops.com;

public class employee extends person {
	 private double annualSalary;
	 private int yearStarted;
	 private String nationalInsuranceNumber;
	 employee(String name,double annualSalary,int yearStarted,String nationalInsuranceNumber){
	        super(name);
	        this.annualSalary = annualSalary;
	        this.yearStarted = yearStarted;
	        this.nationalInsuranceNumber = nationalInsuranceNumber;
	    }
	    public double getAnnualSalary() {
	        return annualSalary;
	    }
	    public int getYearStarted() {
	        return yearStarted;
	    }
	    public String getNationalInsuranceNumber() {
	        return nationalInsuranceNumber;
	    }
	}

