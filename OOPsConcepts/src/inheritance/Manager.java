package inheritance;

public class Manager extends Employee{
	private int numberOfEmp;
	public void readMgr() {
		readEmp();     //calling employee class method
		System.out.println("Enter the number of employee working under him/her");
		numberOfEmp=sc.nextInt();
	}
	public void disMgr() {
		disEmp();     //calling employee class method
		System.out.println("number of employee working "+numberOfEmp);
	}

}
