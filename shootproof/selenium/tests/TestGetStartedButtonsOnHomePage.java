package shootproof.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import shootproof.selenium.pages.HomePage;
import shootproof.selenium.utils.Constants;

public class TestGetStartedButtonsOnHomePage extends BaseTest{
	private HomePage homepage;
	
	@BeforeMethod
	public void launchHomepage() {
		homepage = new HomePage(this.getTargetWebDriver());
		homepage.lauch();
	}
	
	@Test
	public void testClickTopMostGetStartedButton() {
		homepage.waitForTopMostGetStartedBtnToDisplay();
		homepage.clickTopMostGetStartedBtn();
	}
	
	@Test
	public void testClickBottomMostGetYourFreeGalleryButton() throws InterruptedException {
		homepage.scrollToPageBottom();
		Assert.assertTrue(homepage.isBottomMostGetYourFreeGalleryBtnDisplayed(), "Get Started button is Not showing up at the bottom of the page");
		int num_retry = 0;
		while (num_retry < Constants.MAX_RETRIES && !homepage.isBottomMostGetYourFreeGalleryBtnClickable()) {
			homepage.scrollBottomMostGetYourFreeGalleryBtnIntoView();
		}
		homepage.clickBottomMostGetYourFreeGalleryBtn();
	}
	
}
