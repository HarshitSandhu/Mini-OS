package Implementation;

public class FILE {
	private String file_name;
	private double file_size;
	private double file_RAM;
	
	FILE(String file_name, double file_size,double file_RAM)
	{
		this.file_name=file_name;
		this.file_size=file_size;
		this.file_RAM=file_RAM;
	}
	double getFile_size()
	{
		return file_size;
	}
	
	String getfile_name()
	{
		return file_name;
	}
	

}
