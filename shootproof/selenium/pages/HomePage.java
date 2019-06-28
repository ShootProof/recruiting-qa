package shootproof.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import shootproof.selenium.locators.HomePageLocators;

public class HomePage extends BasePage{
	public HomePage(WebDriver targetWebDriver) {
		super(targetWebDriver);
	}

	public void lauch() {
		this.getWebDriver().get("https://shootproof.com/");
	}

	public void scrollToPageBottom() {
		((JavascriptExecutor) this.getWebDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void waitForTopMostGetStartedBtnToDisplay() {
		this.waitOnCondition(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageLocators.TOP_MOST_GET_STARTED_BTN)));
	}
	
	public boolean isBottomMostGetYourFreeGalleryBtnDisplayed() {
		WebElement bottomMostGetStartedBtn = this.getWebDriver().findElement(By.xpath(HomePageLocators.BOTTOM_MOST_GET_YOUR_FREE_GALLERY_BTN));
		return bottomMostGetStartedBtn.isDisplayed();
	}
	
	public boolean isBottomMostGetYourFreeGalleryBtnClickable() {
		try {
			this.waitOnCondition(ExpectedConditions.elementToBeClickable(By.xpath(HomePageLocators.BOTTOM_MOST_GET_YOUR_FREE_GALLERY_BTN)));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}
	
	public void scrollBottomMostGetYourFreeGalleryBtnIntoView(){
		WebElement bottomMostGetStartedBtn = this.getWebDriver().findElement(By.xpath(HomePageLocators.BOTTOM_MOST_GET_YOUR_FREE_GALLERY_BTN));
		JavascriptExecutor jse2 = (JavascriptExecutor)this.getWebDriver();
		jse2.executeScript("arguments[0].scrollIntoView()", bottomMostGetStartedBtn);
	}

	public void clickTopMostGetStartedBtn() {
		WebElement topMostGetStartedBtn = this.getWebDriver().findElement(By.xpath(HomePageLocators.TOP_MOST_GET_STARTED_BTN));
		topMostGetStartedBtn.click();
	}
	
	public void clickBottomMostGetYourFreeGalleryBtn() {
		WebElement bottomMostGetStartedBtn = this.getWebDriver().findElement(By.xpath(HomePageLocators.BOTTOM_MOST_GET_YOUR_FREE_GALLERY_BTN));
		bottomMostGetStartedBtn.click();
	}

}
