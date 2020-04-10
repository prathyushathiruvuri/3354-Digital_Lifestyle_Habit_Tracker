import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DLHTTester 
{
	@BeforeClass
	public static void beforeClass() 
	{
		System.out.println("Before Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before Test Case");
	}
	
	@Test
	public void checkPositiveTimeLimit()
	{
		AppInformation newApp1 = new AppInformation();
		//Check positive time limit.
		newApp1.setLimit(60);
		assertEquals(60, newApp1.getTimeLimit(), .01);
		assertEquals("App should be unlocked with limit.", false, newApp1.getIsLocked());
	}
	
	@Test
	public void checkZeroTimeLimit()
	{
		AppInformation newApp2 = new AppInformation();
		//Check zero time limit.
		newApp2.setLimit(0);
		assertEquals(0, newApp2.getTimeLimit(), 0);
		assertEquals("App should be locked.", true, newApp2.getIsLocked());
	}
	@Test
	public void checkNegativeTimeLimit()
	{
		AppInformation newApp3 = new AppInformation();
		//Check negative time limit.
		newApp3.setLimit(-34);
		assertEquals(-34, newApp3.getTimeLimit(), .01);
		assertEquals("App should be unlocked.", false, newApp3.getIsLocked());
	}
	
	@After
	public void after()
	{
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
}
