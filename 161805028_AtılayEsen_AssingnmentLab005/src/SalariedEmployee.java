
public class SalariedEmployee extends Employee{

	private double weeklySalary;
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		if (weeklySalary < 0) 
	         throw new IllegalArgumentException(
	            "Weekly salary must be >=0");
		this.weeklySalary=weeklySalary;
	   
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double earnings() {
		return this.weeklySalary;
	}

	@Override
	public String toString() {
		String s=super.toString()+"\n"+"Weekly salary: "+this.weeklySalary;
		return s;
	}
	
	

}
