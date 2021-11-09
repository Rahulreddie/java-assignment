package Encapsulation;

public class EmployeeClass 
{
	public static void main(String[]agrs)
	{
		Employee e = new Employee("RAHUL REDDY",766088195);
		e.setId("COG7660");
		e.setSal(29950.00);
		e.student();
		System.out.println("Employee Id is : "+e.getId());
		System.out.println("Employee Salary is : "+e.getSal()+"/-");		
	}
}
