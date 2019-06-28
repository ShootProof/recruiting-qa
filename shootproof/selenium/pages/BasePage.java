package shootproof.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import shootproof.selenium.utils.Constants;

public class BasePage {
	private WebDriver webDriver;
	
	public BasePage (WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	protected WebDriver getWebDriver () {
		return this.webDriver;
	}
	
	protected WebElement waitOnCondition(ExpectedCondition<WebElement> condition){
		WebDriverWait wait = new WebDriverWait(this.getWebDriver(), Constants.FIVE_SECS);
		WebElement element = wait.until(condition);
		return element;
	}
}
