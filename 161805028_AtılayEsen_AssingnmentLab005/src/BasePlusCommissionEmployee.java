
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commisionRate,double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
		if (baseSalary < 0) 
	         throw new IllegalArgumentException(
	            "Base salary must be >=0");
	    this.baseSalary=baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public double earnings() {
		
		return super.earnings() + this.baseSalary;
	}
	@Override
	public String toString() {
		String s=super.toString()+"\n"+"Base salary: "+this.baseSalary;
		return s;
	}
	

}
