package Implementation;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;


public class Main {
	public static void cal()
	{
		System.out.println("The current month is APRIL'2018-");
		System.out.println("S\tM\tT\tW\tTh\tF\tS");
		int val=1;
		System.out.println(" \t \t \t \t  \t \t1");
		val++;
		while(val<=30)
		{
			for(int i=0;i<7;i++)
			{
				if(val>30)
				{
					break;
				}
				System.out.print((val++)+"\t");
			}
			if(val>30)
			{
				break;
			}
			System.out.println();
		}
		return;
	}
	/*public static void commandprompt(ArrayList<DIRECTORY> dList)
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
	*/

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
	    		   int flag=0;
	    		   String log="log:";
	    		   System.out.println("\t\t\t*Command Prompt*");
	    			while(true)
	    			{
	    				System.out.print("\n>");
	    				String input= sc.nextLine();
	    				log=log+"->"+input;
	    				if(input.equals("ls-a"))
	    				{
	    					for(int i=0;i<dlist.size();i++)
	    				       {                                                                 ///// display all the files in all directories
	    				    	   System.out.println(dlist.get(i).DirectoryName+":");
	    				    	   dlist.get(i).show_contents();
	    				       }
	    				}
	    				else if(input.equals("learn ls-a"))
	    				{
	    					System.out.println("ls-a used to print all the files in all directories\nSyntax: ls-a");
	    				}
	    				else if(input.equals("ls"))
	    				{
	    					System.out.println("The following directories exist:");
	    					for(int i=0;i<dlist.size();i++)
	    					{
	    						System.out.println(i+1+":"+dlist.get(i).DirectoryName+" containing "+ dlist.get(i).contents.size()+" files and size is "+dlist.get(i).getDirectorySize()+"Gb");
	    					}
	    				}
	    				else if(input.contains("mkdir"))
	    				{
	    					if(input.length()==5)
	    					{
	    						System.out.println("no directory name inserted");
	    						System.out.println("Directory not created try learn mkdir");
	    					}
	    					else{
	    					dlist.add(new DIRECTORY(input.substring(6)));
	    					}
	    				}
	    				else if(input.equals("learn mkdir"))
	    				{
	    					System.out.println("mkdir command is used to create a new directory\nSyntax: mkdir 'Directory name'");
	    				}
	    				else if(input.equals("learn ls"))
	    				{
	    					System.out.println("ls is used to display the list of all the directories on your system");
	    				}
	    				else if(input.equals("cal"))
	    				{
	    					cal();
	    				}
	    				else if(input.equals("learn cal"))
	    				{
	    					System.out.println("cal command used to print the calendar of the current month");
	    				}
	    				else if(input.equals("log"))
	    				{
	    					System.out.println(log);
	    				}
	    				else if(input.equals("learn log"))
	    				{
	    					System.out.println("log is used to display the trace of all shell commands made till now");
	    				}
	    				
	    				
	    				
	    				
	    				
	    				else if(input.equals("Exit"))
	    				{
	    					System.out.println("Exiting shell");
	    					break;
	    				}
	    				else if(input.equals("learn exit"))
	    				{
	    					System.out.println("'Exit' is used to exit from shell");
	    				}
	    				else
	    				{
	    					if(flag==1){
		    					System.out.println("Command not recognized,are you typing correctly? try learn with Available commands ");
		    					System.out.println("Available commands are:");
	    						System.out.println("ls");
	    						System.out.println("ls-a");
	    						System.out.println("mkdir");
	    						System.out.println("log");
	    						System.out.println("cal");
	    						System.out.println("Exit");
	    						System.out.println("eg- 'learn mkdir'");
		    					}
	    					if(flag==0)
	    					{
	    						System.out.println("Available commands are:");
	    						System.out.println("ls");
	    						System.out.println("ls-a");
	    						System.out.println("mkdir");
	    						System.out.println("log");
	    						System.out.println("cal");
	    						System.out.println("Exit");
	    						flag=1;
	    					}
	    					
	    				}
	    				
	    			}
	    		   
	    	   }
	    	   else if(check.equals("5"))
	    	   {
	    		   DateFormat ef = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	    	       Date dateobj1 = new Date();
	    	       System.out.println("Session end date and time :"+ef.format(dateobj1));
	    		   return;
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Are you sure you are typing correctly??");
	    	   }
	       }
	   

	}

}
