
public class CommissionEmployee extends Employee{
	private double grossSales,commisionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales,double commisionRate) {
		super(firstName, lastName, socialSecurityNumber);
		if (grossSales < 0) 
	         throw new IllegalArgumentException(
	            "Gross sales must be >=0");
		if (commisionRate<0||commisionRate>1) 
	         throw new IllegalArgumentException(
	            "Commission rate must be >0 and <1");
		this.grossSales=grossSales;
		this.commisionRate=commisionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}

	@Override
	public double earnings() {
		return this.commisionRate*this.grossSales;
	}

	@Override
	public String toString() {
		String s=super.toString()+"\n"+"Gross sales: "+this.grossSales+"\n"+"Comission rate: "+this.commisionRate;
		return s;
	}

	

}
