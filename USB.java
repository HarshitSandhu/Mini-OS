package Implementation;
import java.util.ArrayList;
public class USB {
	
	public ArrayList<FILE> contents;
	USB()
	{
		contents= new ArrayList<FILE>();
		contents.add(new FILE("IMAGES",32,0.043));
		contents.add(new FILE("MOVIES",47.67,0.043));
		contents.add(new FILE("Tangibles",3,0.043));
		contents.add(new FILE("os_e03.docs",0.967,0.043));
		contents.add(new FILE("delfil",24,0.043));
		contents.add(new FILE("img1.jpeg",0.67,0.043));
		contents.add(new FILE("fun.ppt",2.34,0.043));
		contents.add(new FILE("lmao",11.67,0.043));
	}
	
	public void display()
	{
		System.out.println("S.no\t\tFileName\t\tSize");
		for(int i=0;i<contents.size();i++)
		{
			System.out.print(i+1+"\t\t"+contents.get(i).getfile_name()+"\t\t"+contents.get(i).getFile_size());
			System.out.println();
		}
	}
	
	
	
	
	
}
