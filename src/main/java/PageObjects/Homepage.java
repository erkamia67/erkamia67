package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	public WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	private By login = By.cssSelector("[href*='sign_in']");
	private By email = By.cssSelector("#user_email");
	private By password = By.cssSelector("#user_password");
	private By signin = By.cssSelector("[name='commit']");
	private By text = By.cssSelector("[class='text-center'] h2");

	public WebElement login() {

		return driver.findElement(login);

	}

	public WebElement getTitle() {
		return driver.findElement(text);
	}

	public WebElement email() {
		return driver.findElement(email);

	}

	public WebElement password() {
		return driver.findElement(password);

	}

	public WebElement signin() {
		return driver.findElement(signin);

	}
}
