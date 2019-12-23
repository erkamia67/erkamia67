package qaclickacademy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Homepage;

public class NavigateTest extends base {

	@BeforeTest
	public void beforeTest() throws IOException {
		driver = initiliazeDriver();

	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password) throws IOException {

		Homepage l = new Homepage(driver);
		driver.get(prop.getProperty("url"));

		l.login().click();
		l.email().sendKeys(username);
		l.password().sendKeys(password);
		l.signin().click();

	}

	@Test
	public void homePageNavigation() {
		Homepage l = new Homepage(driver);
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] myData = new Object[2][2];
		myData[0][0] = "erkamguler67@gmail.com";
		myData[0][1] = "123";
		myData[1][0] = "erkamguler1903@gmail.com";
		myData[1][1] = "1234";
		return myData;

	}

}
