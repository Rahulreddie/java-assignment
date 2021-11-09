package encpasulation1;

public class bank 
{
	String name;
	private int id;
	private int password;

bank(String name)
{
	this.name=name;
}
void display()
{
	System.out.println("Account Holder name :"+name);
}
String id(int id)
{
	if(id==123456)
	{
		return "Valid Id ";
	}
	else
	{
		return "Enter valid Id"; 
	}
}
String password(int password)
{
    if (password==456789)
    {
		return "Valid Password";
	}
    else
    {
    	return "Enter valid Password";
    }
}
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
public void setPassword(int password)
{
	this.password=password;
}
public int getPassword()
{
	return password;
}

}

