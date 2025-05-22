package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_vs_SoftAssertions {
	
	@Test
	void testHardAssertions()
	{
		System.out.println("testing..");
		System.out.println("testing..");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("testing..");
		System.out.println("testing..");
	}

	@Test
	void testSoftAssertions()
	{
		System.out.println("testing..");
		System.out.println("testing..");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("testing..");
		System.out.println("testing..");
		
		sa.assertAll();  //mandatory 
	}
	
	
}
