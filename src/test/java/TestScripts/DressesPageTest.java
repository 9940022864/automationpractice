package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DressesPageObjects;
import pageObjects.HomePageObjects;

public class DressesPageTest {

	DressesPageObjects dp;
	HomePageObjects hp;

	public DressesPageTest() {
		dp = new DressesPageObjects();
		hp = new HomePageObjects();
	}

	@Test
	public void verifyProductCount() {
		hp.clickDresses();
		int actual = dp.getProductCountFromHeader();
		int expected = dp.getProductCount();
		Assert.assertTrue(actual == expected, "Failed: Count mismatched");
	}
}
