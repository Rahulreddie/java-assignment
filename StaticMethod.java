/*
Static Method:-
               A method declare inside class prefix with static modifier.
			   Syntax: static return_type method_name([formal arg])
			   {
				   //statements;
			   }
*/
class  StaticMethod
{
	static int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		System.out.println("Main method begins");
		add();
		sub();
		mul();
		test();
		System.out.println("main meethod ends");
	}
	static void add()
	{
		System.out.println("adding");
		int c=a+b;
		System.out.println(c);
	}
	static void sub()
	{
		System.out.println("substraction");
		int c1=a-b;
		System.out.println(c1);
	}
	static void mul()
	{
		System.out.println("Multiplication");
		int c2=a*b;
		System.out.println(c2);
	}
   static void test()
	{
	   System.out.println("Test method begins");
	   int a=30;// this a variable is local to this block
	   int b=40;// this b variable is local to this block
	   int c=a+b;// this c variable is local to this block
	   System.out.println(c);
       System.out.println("Accessing Global variables");
	   int c1=StaticMethod.a+StaticMethod.b;//we can access global varible with the help of class name.
	   System.out.println(c1);

    }
}
