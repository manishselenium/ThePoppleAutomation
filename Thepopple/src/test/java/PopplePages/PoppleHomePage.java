package PopplePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PoppleUtils.WrapperGenericMethod;

public class PoppleHomePage {

	By SiteLogo = By.cssSelector("path.fil0:nth-child(3)");
    By PositiveCategories = By.cssSelector("li.subMenu:nth-child(1) > a:nth-child(1)");
	By popularCategories = By.xpath("/html/body/header/nav/div/ul[1]/li[2]/a");
	By PeopleCategories = By.xpath("/html/body/header/nav/div/ul[1]/li[3]/a");
	By Videos = By.xpath("/html/body/header/nav/div/ul[1]/li[4]/a");
	By Quize = By.xpath("/html/body/header/nav/div/ul[1]/li[5]/a");
	By SearchOption = By.cssSelector(".searchselect > svg:nth-child(1) > path:nth-child(1)");
	By InstaLink = By.cssSelector(".right > li:nth-child(2) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(2) > g:nth-child(1) > path:nth-child(1)");
	By TwittLink = By.cssSelector(".right > li:nth-child(3) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By FacebookLink = By.cssSelector(".right > li:nth-child(4) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)");
	By YouTubeLink = By.cssSelector(".right > li:nth-child(5) > a:nth-child(1) > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)");

	By FeaturedPostImage = By.xpath("//*[@id='promoted_stories_img_0']");
	By FeaturedPostAuthor = By.xpath("//*[@id='hm_lm_un_1']");
	By SecondPostImage = By.xpath("//*[@id='promoted_stories_img_1']");
	By SecondPostAuthor = By.xpath("//*[@id='vtpl-container']/div/div[2]/p[2]/a");
	By ThirdPostImage = By.xpath("//*[@id='promoted_stories_img_2']");
	By ThirdPostAuthor = By.xpath("//*[@id='vtpl-container']/div/div[3]/p[2]/a");
	By FeaturedPostContent = By.xpath("//*[@id='promoted_title_0']");
	By SecondPostContent = By.xpath("//*[@id='promoted_title_1']");
	By ThirdPostContent = By.xpath("//*[@id='promoted_title_2']");
	By LatestStoryImage = By.xpath("//*[@id='hm_ls_1']");
	By LatestStoryContent = By.xpath("//*[@id='hm_ls_t_1']");
	By LatestStoryAuthor = By.xpath("//*[@id='hm_ls_un_1']");
	By PoppleVideo1 = By.xpath("//*[@id='hm_vid_1']/a[2]");
	By PoppleVideo2 = By.xpath("//*[@id='hm_vid_2']/a[2]");
	By QuizeFeedImage = By.xpath("//*[@id='hm_qf_1']");
	By QuizefeedContent = By.xpath("//*[@id='hm_qf_t_1']");
	By QuizeFeedAuthor = By.xpath("//*[@id='hm_qf_1']");
	By EatSleepReadReaptImage = By.xpath("//*[@id='hm_lm_1']");
	By EatSleepReadReaptContent = By.xpath("//*[@id='hm_lm_t_1']");
	By EatSleepReadReaptAuthor = By.cssSelector("#hm_lm_un_1");
	

	WrapperGenericMethod Action = new WrapperGenericMethod();
	
	public void SiteLogo(WebDriver driver) {

		int Element = driver.findElements(SiteLogo).size();
		Assert.assertEquals(Element, 1);
	}

	public void SearchOption(WebDriver driver) {

		int Element = driver.findElements(SearchOption).size();
		Assert.assertEquals(Element, 1);
	}

	public void InstaLink(WebDriver driver) throws InterruptedException {

		Thread.sleep(5000);

		int Element = driver.findElements(InstaLink).size();
		Assert.assertEquals(Element, 1);
	}

	public void TwittLink(WebDriver driver) {

		int Element = driver.findElements(TwittLink).size();
		Assert.assertEquals(Element, 1);
	}

	public void FacebookLink(WebDriver driver) {

		int Element = driver.findElements(FacebookLink).size();
		Assert.assertEquals(Element, 1);
	}

	public void YouTubeLink(WebDriver driver) {

		int Element = driver.findElements(YouTubeLink).size();
		Assert.assertEquals(Element, 1);
	}



	public void PositiveCategories(WebDriver driver) {

		int Element = driver.findElements(PositiveCategories).size();
		Assert.assertEquals(Element, 1);
	}

	public void popularCategories(WebDriver driver) {

		int Element = driver.findElements(popularCategories).size();
		Assert.assertEquals(Element, 1);
	}

	public void PeopleCategories(WebDriver driver) {
		
		int Element = driver.findElements(PeopleCategories).size();
		Assert.assertEquals(Element, 1);
	}

	public void Videos(WebDriver driver) {

		int Element = driver.findElements(Videos).size();
		Assert.assertEquals(Element, 1);
	}

	public void Quize(WebDriver driver) {

		int Element = driver.findElements(Quize).size();
		Assert.assertEquals(Element, 1);
	}

	public void FeaturedPostImage(WebDriver driver) {

		int ImageSize = driver.findElements(FeaturedPostImage).size();
		Assert.assertEquals(ImageSize , 1);
	}

	public void FeaturedPostContent(WebDriver driver) {
		int ContentSize = driver.findElements(FeaturedPostContent).size();
		Assert.assertEquals(ContentSize, 1);
	}

	public void FeaturedPostAuthor(WebDriver driver) {
		int ContentSize = driver.findElements(FeaturedPostAuthor).size();
		Assert.assertEquals(ContentSize, 1);
	}

	public void SecondPostImage(WebDriver driver) {
		int ImageSize = driver.findElements(SecondPostImage).size();
		Assert.assertEquals(ImageSize , 1);
	}

	public void SecondPostContent(WebDriver driver) {
		int ContentSize = driver.findElements(SecondPostContent).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void SecondPostAuthor(WebDriver driver) {
		int ContentSize = driver.findElements(SecondPostAuthor).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void ThirdPostImage(WebDriver driver) {
		int ImageSize = driver.findElements(ThirdPostImage).size();
		Assert.assertEquals(ImageSize , 1);
	}

	public void ThirdPostContent(WebDriver driver) {
		int ContentSize = driver.findElements(ThirdPostContent).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void ThirdPostAuthor(WebDriver driver) {
		int ContentSize = driver.findElements(ThirdPostAuthor).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void LatestStoryImage(WebDriver driver) {
		int ImageSize = driver.findElements(LatestStoryImage).size();
		Assert.assertEquals(ImageSize , 1);
	}

	public void LatestStoryContent(WebDriver driver) {
		int ContentSize = driver.findElements(LatestStoryContent).size();
		Assert.assertEquals(ContentSize, 1);
	}

	public void LatestStoryAuthor(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(LatestStoryAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);
		int ContentSize = driver.findElements(LatestStoryAuthor).size();
		Assert.assertEquals(ContentSize, 1);

	}

	public void video1(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(PoppleVideo1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(PoppleVideo1).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void video2(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(PoppleVideo2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(PoppleVideo2).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void QuizeFeedImage(WebDriver driver) throws InterruptedException {

		WebElement element = driver.findElement(QuizeFeedImage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(QuizeFeedImage).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void QuizefeedContent(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(QuizefeedContent);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(QuizefeedContent).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void QuizeFeedAuthor(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(QuizeFeedAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(QuizeFeedAuthor).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void EatSleepReadReaptImage(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(EatSleepReadReaptImage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(EatSleepReadReaptImage).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void EatSleepReadReaptContent(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(EatSleepReadReaptContent);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(EatSleepReadReaptContent).size();
		Assert.assertEquals(videoFrame, 1);

	}

	public void EatSleepReadReaptAuthor(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(EatSleepReadReaptAuthor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		int videoFrame = driver.findElements(EatSleepReadReaptAuthor).size();

		Assert.assertEquals(videoFrame, 2);

	}

	public void ClickFeaturedPost(WebDriver driver) {

		Action.Click(driver, FeaturedPostImage);

	}

	public void ClickSecondPost(WebDriver driver) {

		Action.Click(driver, SecondPostImage);

	}

	public void ClickThirdPost(WebDriver driver) {

		Action.Click(driver, ThirdPostImage);

	}

	public void ClickLatestPost(WebDriver driver) throws InterruptedException {

		WebElement element1 = driver.findElement(LatestStoryImage);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, LatestStoryImage);

	}

}
