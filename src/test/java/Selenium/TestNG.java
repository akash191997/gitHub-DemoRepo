package Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {

	@Test(priority = 1)
	public void demo() {

		Reporter.log("Priority is 1st",true);
	}
	
	@Test(priority = 2)
	public void demo1()
	{
		Reporter.log("Priority is 2nd",true);
	}
	
	@Test(invocationCount = 3)  //default priority is 0, so it will execute 1st and repeat same execution for 3 times
	public void demo2()
	{
		Reporter.log("Invocation count",true);
	}
	
	@Test(enabled = false)
	public void demo3()
	{
		Reporter.log("enable",true);
	}
	
	@Test(description = "Executing description")
	public void demo4()
	{
		Reporter.log("Description flag",true);
	}
	
	@Test( dependsOnMethods = "demo4",  alwaysRun = true)
	public void demo5()
	{
		Reporter.log("Always Run flag",true);
	}
	
	@Test(groups = "Functional Testing")
	public void demo6()
	{
		Reporter.log("Functional Testing group",true);
	}
	
	@Test(dependsOnMethods = "demo8")
	public void demo7()
	{
		Reporter.log("DependsOnMethods flag",true);
	}
	
	@Test(groups = "Functional Testing")
	public void demo8()
	{
		Reporter.log("demo8",true);
	}
	
	
//	  <groups>
//	  <run>
//	  
//	  <include name="Functional Testing"></include>
//	  
//	  </run> 
//	  </groups>
	
	

}
