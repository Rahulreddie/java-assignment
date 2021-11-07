/*
TYPECASTING:
       The process of converting one data type into anthoder datatype.There are two types: 1)Primitive typecasting.
	                                                                                       2)Non-Primitive typecastig.

1) Primitive typecasting is used to convert one  primitive datatypes antother primitive datatype.It is divided into two types they are 1) Widening.
                                                                                                                                       2) Narrowing.
   byte<short<int<long<float<double
             <char
			   
			   Widening:
			   The process of converting Smaller range values into Larger range values.
			   1)In this there is no dataloss
			   2)As there is no dataloss compiler will convert implicitly so we can call this as auto widening.

			 
*/
class Widening_typecasting
{
	public static void main(String args [])
	{
		int a=10;
		long b=a;
		char ch='a';
		float c=ch;
		System.out.println(b+"  "+c);// 10  97.0
		int a1=10;
		int b1=20;
		float c1= a1+b1;
		char  a2='s';
		char b2='d';
		int c2=a2+b2;
		System.out.println(c1+"  "+c2); //30.0  215
	}
}
