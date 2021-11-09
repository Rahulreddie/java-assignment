package encpasulation1;
import java.util.Scanner;
public class bankclass
{
      public static void main(String[]args)
    {
    	Scanner input=new Scanner(System.in);
    	bank b = new bank("K RAHUL REDDY");
    	b.display();
    	System.out.println("**************************************");
    	System.out.print("Enter your user Id :");
    	int id = input.nextInt();
    	b.setId(id);
    	System.out.println("Account Id :"+b.getId());
    	System.out.println(b.id(id));
    	System.out.println("**************************************");
    	System.out.print("Enter your password :");
    	int password = input.nextInt();
    	b.setPassword(password);
    	System.out.println("Your password :"+b.getPassword());
    	System.out.println(b.password(password));
    	
	}
		
	

}
