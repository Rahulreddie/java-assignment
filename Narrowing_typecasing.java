/*  Narrowning:
			   The process of converting Larger range  values into smller range values.
			   1) In this there is a possibility of dataloss.
			   2) As there is possibility of dataloss compiler will not convert implicitly,Programmer (or) Developer have to convert explicitly with the help of typecasting Operator.
There are unary operator (which accept only one operand).
syntax:(type) variale/values/(expression).
*/
class Narrowing_typecasing 
{
	public static void main(String[] args) 
	{
		int a=97;
		char b=(char)a;
		System.out.println(b); //a

		int c=67;
		int d=10;
		char e=(char)(d+c);
		System.out.println(e); //M
	}
}
