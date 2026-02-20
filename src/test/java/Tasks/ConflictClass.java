package Tasks;

import org.testng.annotations.Test;

public class ConflictClass 
{
	@Test
	public void m()
	{
		System.out.println("line from b2");
		
		System.out.println("Extra line b2");
	}

}
