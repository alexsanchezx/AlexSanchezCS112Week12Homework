import java.util.Random;
public class TripleDice extends dice
{
	public TripleDice(int Bounces, int Value)
	{
		super(Bounces,Value);
	}
	public int Throw() 
	{
		for(int x = 3; x>0 ;x--)
		{		
			value = value+super.Throw();			
		}
		value = value/3;
		return value;
	}	
}

// what does the value parameter do, Ales?
//public TripleDice(int Bounces, int Value)
	
		
