package Implementation;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;


public class Main {
	public static void commandprompt(ArrayList<DIRECTORY> dList)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("\t\t\t*Command Prompt*");
		while(true)
		{
			System.out.print("\n>");
			String input= sc.nextLine();
			if(input.equals("ls-a"))
			{
				for(int i=0;i<dList.size();i++)
			       {                                                                 ///// display all the files in all directories
			    	   System.out.println(dList.get(i).DirectoryName+":");
			    	   dList.get(i).show_contents();
			       }
			}
			else if(input.equals("learn ls-a"))
			{
				System.out.println("ls-a used to print all the files in all directories\nSyntax: ls-a");
			}
			else if(input.equals("Exit"))
			{
				return;
			}
			else
			{
				System.out.println("Command not recognized try learn ");
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("\t\t\t Operating System");
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println("Session date and time :"+df.format(dateobj));
	       CPU cpu;
	       while(true){
	       System.out.println("Enter username:");
	       String username=sc.next();
	       if(username.equals("admin"))
	       {
	    	   System.out.println("Enter password:");
	    	   String password=sc.next();
	    	   if(password.equals("12345"))
	    	   {
	    		   System.out.println("welcome admin!!");
	    		   cpu=new CPU();
	    		   break;
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Access denied retry");
	    	   }
	       }
	       }
	       
	       DIRECTORY c= new DIRECTORY("c");
	       DIRECTORY d= new DIRECTORY("d");
	       ArrayList<DIRECTORY> dlist= new ArrayList<DIRECTORY>();
	       dlist.add(c);
	       FILE file1=new FILE("file1",18.75,0.11);
	       c.addToDirectory(file1, cpu);
	       dlist.add(d);
	       FILE file2=new FILE("fileA",9.75,0.17);
	       d.addToDirectory(file2, cpu);
	      /* 
	       for(int i=0;i<dlist.size();i++)
	       {                                                                 ///// display all the files in all directories
	    	   System.out.println(dlist.get(i).DirectoryName+":");
	    	   dlist.get(i).show_contents();
	       }
	       
	       */
	       
	       while(true)
	       {
	    	   System.out.println("1.Make Directory");
	    	   System.out.println("2.Make File");
	    	   System.out.println("3.Insert USB");
	    	   System.out.println("4.Open Command Prompt");
	    	   System.out.println("5.Shut Down");
	    	   String check=sc.next();
	    	   if(check.equals("1"))
	    	   {
	    		   continue;
	    	   }
	    	   else if(check.equals("2"))
	    	   {
	    		   continue;
	    	   }
	    	   else if(check.equals("3"))
	    	   {
	    		   continue;
	    	   }
	    	   else if(check.equals("4"))
	    	   {
	    		   commandprompt(dlist);
	    		   continue;
	    	   }
	    	   else
	    	   {
	    		   DateFormat ef = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    	       Date dateobj1 = new Date();
	    	       System.out.println("Session end date and time :"+ef.format(dateobj));
	    		   return;
	    	   }
	       }
	   

	}

}
