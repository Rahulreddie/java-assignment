/*
Parametraized_method: A method declare with formal arguments.
					 Formal arguments:- The variable declare with the help of datatype is known as formal arguments.
					 Actual arguments:- The value pass to the method calling statement.
1) Length of foraml argument should be equal to actual argument.
*/
class Parametraized_method 
{
	public static void main(String[] args) 
	{
		test(10,20);
	}
	static void test(int arg1,int arg2)
	{
		int res= arg1+arg2;
		System.out.println(res);
	}
}
