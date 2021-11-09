/*
Initializer:-
           It is used to execute startup instructions.
		   Static blocks are excute before the main method excutes.
		   Static block execution start from top to bottom.
*/
class StaticInitializer 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	static
	{
		System.out.println("Welcome To");
	}
	static 
	{
		System.out.println("Java World!");
	}
}
