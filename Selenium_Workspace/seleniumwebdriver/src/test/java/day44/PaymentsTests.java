package day44;

import org.testng.annotations.Test;

public class PaymentsTests {
	
	@Test(priority = 1, groups = {"regression", "sanity"})
	void paymentsInRupees()
	{
		System.out.println("payments In Rupees");
	}

	@Test(priority = 2, groups = {"regression", "sanity","functional"})
	void paymentsInDollars()
	{
		System.out.println("payments In Dollars");
	}

//	@Test(priority = 3, groups = {"regression", "sanity", "functional"})
//	void paymentsInDirham()
//	{
//		System.out.println("payments In Dirham");
//	}
}