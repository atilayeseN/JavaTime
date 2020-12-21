
public class Test {
	public static void main(String[] args) {
		SalariedEmployee emp=new SalariedEmployee("George", "Harrison", "11-11", 700);
		HourlyEmployee emp1=new HourlyEmployee("Paul", "McCartney", "22-22", 3.70, 72);
		CommissionEmployee emp2=new CommissionEmployee("Ringo", "Star", "33-33", 2000, 0.25);
		BasePlusCommissionEmployee emp3=new BasePlusCommissionEmployee("John", "Lennon", "44-44", 5000, 0.04, 300);
	   System.out.println(emp.toString());
	   System.out.println("Earnings: "+emp.earnings());
	   System.out.println();
	   System.out.println(emp1.toString());
	   System.out.println("Earnings: "+emp1.earnings());
	   System.out.println();
	   System.out.println(emp2.toString());
	   System.out.println("Earnings: "+emp2.earnings());
	   System.out.println();
	   System.out.println(emp3.toString());
	   System.out.println("Earnings: "+emp3.earnings());
	   System.out.println();
	   Employee[] emps=new Employee[4];
	   emps[0]=emp;
	   emps[1]=emp1;
	   emps[2]=emp2;
	   emps[3]=emp3;
	   for(Employee i:emps) {
		   System.out.println(i);
		   if(i instanceof BasePlusCommissionEmployee) {
			   BasePlusCommissionEmployee be=(BasePlusCommissionEmployee) i;
			   double bs=be.getBaseSalary();
			   be.setBaseSalary(bs+bs/10);
		   }
		   System.out.println("Earning: "+i.earnings());
		   System.out.println("Class name: "+i.getClass().getName());
		   System.out.println();
	   }
	   
	
	
	   
	}

}
