package Implementation;

public class USB {
	private final double maxSpace;
	private double spaceAvailable;
	/// ArrayList of different contents
	USB(double maxSpace,double spaceAvailable)
	{
		this.maxSpace=maxSpace;
		this.spaceAvailable=spaceAvailable;
	}
	
	void clearUSB()
	{
		spaceAvailable=maxSpace;
		/// remove all files from usb
	}
	
	void add(/* file*,*/double program_size)
	{
		/// add file to array list
		spaceAvailable=spaceAvailable-program_size;
	}
	
	void remove(/*file*/double program_size )
	{
		spaceAvailable=spaceAvailable-program_size;
	}
}
