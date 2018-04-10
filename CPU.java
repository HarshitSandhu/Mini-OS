package Implementation;

public class CPU {
	private final double RAM;
	private double ROM;
	private double EffectiveRAM;
	boolean port1_plugged;
	boolean port2_plugged;
	CPU()
	{
		RAM=4.002d;
		EffectiveRAM=3.001d;
		ROM=467d;
	}
	public double SystemSpace()
	{
		return RAM-EffectiveRAM;
	}
	
	public double getRam()
	{
		return EffectiveRAM;
	}
	public double getROM()
	{
		return ROM;
	}
	
	public void setROMafterDeletion(double size_program)
	{
		ROM=ROM+size_program;
	}
	
	public void setROMafterAddition(double size_program)
	{
		ROM=ROM-size_program;
	}
	
	public void setRAM(double size_program)
	{
		EffectiveRAM-=size_program;
	}
	public void plugged(boolean port)
	{
		this.port1_plugged=true;
	}
	
	public boolean RAM_permits(FILE f)
	{
		double val= EffectiveRAM-f.getFile_size();
		
		if(val>=1.00d)
		{
			EffectiveRAM=val;
			return true;	
		}
		else
		{
			return false;
		}
	}
	public void run(FILE F)
	{
		if(RAM_permits(F))                        
		System.out.println(F.getfile_name()+" is running");	
	}
	
}
