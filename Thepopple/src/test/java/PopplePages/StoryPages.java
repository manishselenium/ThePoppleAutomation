package PopplePages;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import PoppleUtils.WrapperGenericMethod;

public class StoryPages {
	
	
	By AdvertisementFrame = By.cssSelector("div.vtpl-pramotion:nth-child(1) > div:nth-child(1)");
	By FeaturedPostImage = By.xpath("//*[@id='promoted_stories_img_0']");
	By StoryFirstImage = By.cssSelector("div.background--img");
	By StoryAuthor = By.cssSelector("div.vtpl_story:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > span:nth-child(1)");
	By StoryTitle = By.cssSelector("div.vtpl_story:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > h1:nth-child(1)");
	By StoryDesc = By.cssSelector(".vtpl-storyOneLinear");
	By StoryShares = By.cssSelector("span.st-label:nth-child(1)");
	By FBlink = By.cssSelector("div.st-btn:nth-child(2) > span:nth-child(2)");
	By TweetLink = By.cssSelector("div.st-btn:nth-child(3) > span:nth-child(2)");
	By PintrestLink = By.cssSelector("div.st-btn:nth-child(4) > span:nth-child(2)");
	By WhatsappLink = By.cssSelector("div.st-btn:nth-child(5) > span:nth-child(2)");
	By DirectShare = By.cssSelector("div.st-btn:nth-child(6) > span:nth-child(2)");
	By StoryContent = By.cssSelector("div.col:nth-child(6)");
	By NextStoryFrame = By.xpath("/html/body/div[5]/div/div/div/div[2]/div[2]/div[8]/div[41]/svg");
	
	

	WrapperGenericMethod Action = new WrapperGenericMethod();
	
	
	public void AdvertisementFrame(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int Element = driver.findElements(AdvertisementFrame).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void ClickFeaturedPost(WebDriver driver) {

		Action.Click(driver, FeaturedPostImage);

	}
	
	
	public void StoryFirstImage(WebDriver driver) {

		int Element = driver.findElements(StoryFirstImage).size();
		Assert.assertEquals(Element, 1);
	}

	public void StoryAuthor(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryAuthor).size();
		Assert.assertEquals(Element, 1);
	}
	
	
	public void StoryTitle(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryTitle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryTitle).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void StoryDesc(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryDesc);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryDesc).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void StoryShares(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryShares);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryShares).size();
		Assert.assertEquals(Element, 1);
	}
	
	
	public void StoryShareOptions(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryShares);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(FBlink).size();
		Assert.assertEquals(Element, 1);
		int Element1 = driver.findElements(TweetLink).size();
		Assert.assertEquals(Element1, 1);
		int Element2 = driver.findElements(PintrestLink).size();
		Assert.assertEquals(Element2, 1);
		int Element3 = driver.findElements(WhatsappLink).size();
		Assert.assertEquals(Element3, 1);
		int Element4 = driver.findElements(DirectShare).size();
		Assert.assertEquals(Element4, 1);
	}
	
	public void StoryContent(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(StoryContent);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(StoryContent).size();
		Assert.assertEquals(Element, 1);
	}
	
	public void NextStoryFrame(WebDriver driver) throws InterruptedException {
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement NextStoryelement1 = driver.findElement(NextStoryFrame);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NextStoryelement1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
        
       
		
		
        if (driver.findElement(NextStoryFrame).isDisplayed()) {
        	
        	int Element = driver.findElements(NextStoryFrame).size();
    		Assert.assertEquals(Element, 1);
           
            }
        else
        	
        {
        	WebElement NextStoryelement1 = driver.findElement(NextStoryFrame);
    		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NextStoryelement1);
        }
		
		int Element = driver.findElements(NextStoryFrame).size();
		Assert.assertEquals(Element, 1);
	}
	

}

