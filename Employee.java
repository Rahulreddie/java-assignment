package Encapsulation;

public class Employee 
{
	String name;
	private String id;
	private double sal;
	int Ph_no;
    Employee(String arg, int arg2)
    {
    	name = arg;
    	Ph_no =arg2;
    }
    void student()
    {
    	System.out.println("Employee name is : "+name);
    	System.out.println("Employee Phoone_number is : "+Ph_no);
    }
    public void setSal(double arg)
    {
    	sal=arg;
    }
    public double getSal()
    {
    	return sal;
    }
    public void  setId(String arg)
    {
    	id=arg;
    }
    public String getId()
    {
    	return id;
    }
}
