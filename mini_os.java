import java.util.*;

public class main{
	Scanner sc[]=new Scanner(System.in);
	void validate()
	{
		System.out.println("Command Invalid");
		
	}
	public static void main(String args[])
	{
		Arraylist<FILE> unames;
		Arraylist<FILE> pswd;
		//unames.add("super");
		//pswd.add("super");
		unames.add("admin");
		pswd.add("admin");
		System.out.println("This is the Shell interpreter");
		System.out.println("Enter username");
		String username=sc.nextLine();
		System.out.println("Enter password");
		String password=sc.nextLine();
		int flag=0;
						
		for(int i=0;i<unames.size();i++)
			{
					if(username.equals(unames.get(i))&&password.equals(pswd.get(i)))
						{
							if(i==1)
							{
								System.out.println("Welcome Superuser");//The first record of username and password will be of Superuser
								flag=1;
								break;
							}
							else
							{
								System.out.println("Welcome User");//For different users
								flag=1;
								break;
							}
						}
							
			}
						
					if(flag==0)
					{
						System.out.println("Invalid Details");
					}
					
		do
		{
			
			String command=sc.nextLine();
			switch(command)
			{
				case "mkdir":
					mkdir();
					break;
				case "sysdate":
					sysdate();
					break;
				case "sysinfo":
					sysinfo();
					break();
				//Keep on adding commands in case 
				
				case "shutdown":
					System.out.prinln("Exiting system");
					
					break;
				default:
					validate();
					
					
					
				
				
					
			}
			
			
			
		}while(!command.equals("shutdown"));
	}
}