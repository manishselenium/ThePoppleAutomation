package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PopplePages.PoppleHomePage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class HomePageTestCasesTest {

	static Properties properties = null;

//	WebDriver driver = new ChromeDriver();
//	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	String string = System.setProperty("webdriver.gecko.driver", "geckodriver");
	WebDriver driver = new FirefoxDriver();
	
	//Timeouts waiting = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	

	PoppleHomePage DashboardItem = new PoppleHomePage();

	@BeforeTest
	public void OpenBrowser() throws IOException {
		

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

}

	@Test(priority = 1)
	public void CheckSearchOption() throws Exception {
		DashboardItem.SearchOption(driver);

	}

	@Test(priority = 2)
	public void CheckFacebookLink() throws Exception {
		DashboardItem.FacebookLink(driver);

	}

	@Test(priority = 3)
	public void CheckInstaLink() throws Exception {
		DashboardItem.InstaLink(driver);

	}

	@Test(priority = 4)
	public void CheckTwittLink() throws Exception {
		DashboardItem.TwittLink(driver);

	}

	@Test(priority = 5)
	public void CheckYouTubeLink() throws Exception {
		DashboardItem.YouTubeLink(driver);

	}

	@Test(priority = 6)
	public void CheckSiteLogo() throws Exception {
		DashboardItem.SiteLogo(driver);

	}

	@Test(priority = 7)
	public void CheckPositiveCategoriesLink() throws Exception {
		DashboardItem.PositiveCategories(driver);

	}

	@Test(priority = 8)
	public void CheckpopularCategoriesLink() throws Exception {
		DashboardItem.popularCategories(driver);

	}

	@Test(priority = 9)
	public void CheckPeopleCategoriesLink() throws Exception {
		DashboardItem.PeopleCategories(driver);

	}

	@Test(priority = 10)
	public void CheckVideosLink() throws Exception {
		DashboardItem.Videos(driver);

	}

	@Test(priority = 11)
	public void CheckQuizeLink() throws Exception {
		DashboardItem.Quize(driver);

	}

	@Test(priority = 12)
	public void CheckFeaturedPostImage() throws Exception {
		DashboardItem.FeaturedPostImage(driver);

	}

	@Test(priority = 13)
	public void CheckFeaturedPostTitle() throws Exception {
		DashboardItem.FeaturedPostContent(driver);

	}

	@Test(priority = 14)
	public void CheckFeaturedPostAuthor() throws Exception {
		DashboardItem.FeaturedPostAuthor(driver);

	}

	@Test(priority = 15)

	public void CheckSecondPostImage() {

		DashboardItem.SecondPostImage(driver);
	}

	@Test(priority = 16)

	public void CheckSecondPostTitle() {

		DashboardItem.SecondPostContent(driver);
	}

	@Test(priority = 17)

	public void CheckSecondPostAuthor() {

		DashboardItem.SecondPostAuthor(driver);

	}

	@Test(priority = 18)

	public void CheckThirdPostImage() {

		DashboardItem.ThirdPostImage(driver);
	}

	@Test(priority = 19)

	public void CheckThirdPostTitle() {

		DashboardItem.ThirdPostContent(driver);
	}

	@Test(priority = 20)

	public void CheckThirdPostAuthor() {

		DashboardItem.ThirdPostAuthor(driver);
	}

	@Test(priority = 21)

	public void CheckLatestStoryImage() {
		// *[@id="_2223202241376"]/g[3]/path[3]
		DashboardItem.LatestStoryImage(driver);
	}

	@Test(priority = 22)

	public void CheckLatestStoryTitle() {

		DashboardItem.LatestStoryContent(driver);
	}

	@Test(priority = 23)

	public void CheckLatestStoryAuthor() throws InterruptedException {

		DashboardItem.LatestStoryAuthor(driver);
	}

	@Test(priority = 24)

	public void CheckTheVideo1() throws InterruptedException {

		DashboardItem.video1(driver);

	}

	@Test(priority = 25)

	public void Checkvideo2() throws InterruptedException {

		DashboardItem.video2(driver);

	}

	@Test(priority = 26)

	public void CheckQuizeFeedImage() throws InterruptedException {

		DashboardItem.QuizeFeedImage(driver);

	}

	@Test(priority = 27)

	public void CheckQuizefeedTitle() throws InterruptedException {

		DashboardItem.QuizefeedContent(driver);

	}

	@Test(priority = 28)

	public void QuizeFeedAuthor() throws InterruptedException {

		DashboardItem.QuizeFeedAuthor(driver);

	}

	@Test(priority = 29)

	public void CheckEatSleepReadReaptImage() throws InterruptedException {

		DashboardItem.EatSleepReadReaptImage(driver);

	}

	@Test(priority = 30)

	public void CheckEatSleepReadReaptTitle() throws InterruptedException {

		DashboardItem.EatSleepReadReaptContent(driver);

	}

	@Test(priority = 31)

	public void CheckEatSleepReadReaptAuthor() throws InterruptedException {

		DashboardItem.EatSleepReadReaptAuthor(driver);

	}

}
