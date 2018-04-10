package Implementation;
import java.util.ArrayList;
public class DIRECTORY {
	private String DirectoryName;
	private ArrayList<FILE> contents;
	private double directory_size;
	
	DIRECTORY(String DirectoryName)
	{
		this.DirectoryName=DirectoryName;
	}
	
	double getDirectorySize()
	{
		double size=0.000d;
		for(int i=0;i<contents.size();i++)
		{
			size=size+contents.get(i).getFile_size();
		}
		return size;
	}
	void setDirectorySize()
	{
		directory_size=getDirectorySize();
	}
	
	void addToDirectory(FILE f,CPU cpu)
	{
		contents.add(f);
		directory_size=getDirectorySize();
		cpu.setROMafterAddition(f.getFile_size());
		
	}
	
	void deleteFromDirectory(String fname,CPU cpu)
	{
		FILE returnObject=null;
		int i=0;
		while(!contents.get(i).getfile_name().equals(fname))
		{
			i++;
			if(i>=contents.size())
			{
				System.out.println("file not found!!");
				return;
			}
		}
		returnObject=contents.get(i);
		System.out.println("File deleted!!"+returnObject.getFile_size()+" amount of space freed!!");
		contents.remove(i);
		directory_size=getDirectorySize();
		cpu.setROMafterDeletion(returnObject.getFile_size());
		
	}
	
	void show_contents()
	{
		System.out.println("S.no\t\tFile Name\t\tFileSize");
		int index=1;
		for(int i=0;i<contents.size();i++)
		{
			System.out.println((index++)+"\t\t"+contents.get(i).getfile_name()+"\t\t"+contents.get(i).getFile_size());
		}
	}

}
