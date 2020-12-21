
public class HourlyEmployee extends Employee{

	private double wage,hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wage,double hours) {
		super(firstName, lastName, socialSecurityNumber);
		if (wage < 0) 
	         throw new IllegalArgumentException(
	            "Wage must be >=0");
		if (hours < 0||hours>168) 
	         throw new IllegalArgumentException(
	            "Hours must be >=0 and <168");
		this.wage=wage;
		this.hours=hours;
	}

	@Override
	public double earnings() {
		double earning;
		if(this.hours<=40) {
			earning=this.hours*this.wage;
		}
		else {
			earning=40*this.wage+(this.hours-40)*this.wage*1.5;
		}
		return earning;
	}

	@Override
	public String toString() {
		String s=super.toString()+"\n"+"Hourly wage: "+this.wage+"\n"+"Hours worked: "+this.hours;
		return s;
	}

	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	

}
