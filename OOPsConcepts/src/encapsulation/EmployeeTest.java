package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		id=100;
//		name="harsha";
		Employee emp1=new Employee();
//		emp1.id=100;
//		emp1.name="Ravi";
//		emp1.salary=-75000;
		emp1.setValue(100,"Ravi",-75000);  //helper method to set the value
		emp1.display();
		

	}

}
