/*           STATIC AND STATIC MEMBERS
Static:-
1.It is a keyword and modifier.
2.A member declare inside a class prefix with static modifier is knwon as static member.
3.Static member are also called as class members.
Static members:-
1.Static Variibale
2.Static Methods
3.Static Initilizeer.

//STATIC VARIABLE:-
                  * A member declare insdie a class and outside method prefix with static is known as Static Varibale
                  * Static variable completely we can access under the class block where ever we want.

				  Syntax : static datatype varibele=value/varibale/expression.

				  It not mandotary to initilize if it is not inilized it will get the defult value accordiing to its datatype.
				  Static variable we can access with the help of class name.
*/


class  StaticVariable
{
	static int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		int c= a+b;
		System.out.println(c);
		a=40;
		System.out.println(a);
		StaticVariable.a=5;
		System.out.println(a);


	}
}
