/*               -:METHODS:-
Methods are classified into two types based on arguments.They are 1) No argument method.
                                                                  2) Parametraized Method.
           
       1) No argument method:
	                      A method declare without formal arguments is known as no argument method.
						  Declareing method inside anthother method is not possible but we can call anthoer method.

*/

class No_arg_method 
{
	public static void main(String[] args) 
	{
		test();
		sample();
	}
	static void test()
	{
		System.out.println("test method"); //test method
	}
	static void sample()
    {
		System.out.println("Sample method"); //Sample method
	}


}

/*
class No_arg_method 
{
	public static void main(String[] args) 
	{
		static void test()
	{
		System.out.println("test method"); // illegal start of expression
	}
	}
}
*/

