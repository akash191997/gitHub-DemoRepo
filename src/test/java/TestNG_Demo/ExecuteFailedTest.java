package TestNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExecuteFailedTest {

	@Test
	public void demo()
	{
		System.out.println("Success method");
		
	}
	
	@Test
	public void demo1()
	{
		System.out.println("Failed method");
		Assert.fail();
		
	}
	
	
}
