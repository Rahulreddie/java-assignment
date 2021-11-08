import java.util.Scanner;
class  evenodd
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to be searched : ");
		int n = input.nextInt();
		evenodd(n);
	}
	static void evenodd(int arg1)
	{
       if (arg1%2==0)
       {
		   System.out.println("Given number is Even");
       }
	   else
		{
		   System.out.println("Gievn number is Odd");
		}

	}
}
