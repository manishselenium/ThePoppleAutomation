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

public class HomePageTestCasesTest extends ReportGenerate {

	static Properties properties = null;

	WebDriver driver = new ChromeDriver();
	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

//	String string = System.setProperty("webdriver.gecko.driver", "geckodriver");
//	WebDriver driver = new FirefoxDriver();
//  Timeouts waiting = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	

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
		test = extent.createTest("Test 1 - Check Search Option");
		DashboardItem.SearchOption(driver);

	}

	@Test(priority = 2)
	public void CheckFacebookLink() throws Exception {
		test = extent.createTest("Test 2 - Check Facebook Link");
		DashboardItem.FacebookLink(driver);

	}

	@Test(priority = 3)
	public void CheckInstaLink() throws Exception {
		test = extent.createTest("Test 3 - Check Facebook Link");
		DashboardItem.InstaLink(driver);

	}

	@Test(priority = 4)
	public void CheckTwittLink() throws Exception {
		test = extent.createTest("Test 4 - Check Twitter Link");
		DashboardItem.TwittLink(driver);

	}

	@Test(priority = 5)
	public void CheckYouTubeLink() throws Exception {
		test = extent.createTest("Test 5 - Check YouTube Link");
		DashboardItem.YouTubeLink(driver);

	}

	@Test(priority = 6)
	public void CheckSiteLogo() throws Exception {
		test = extent.createTest("Test 6 - Check Site Logo");
		DashboardItem.SiteLogo(driver);

	}

	@Test(priority = 7)
	public void CheckPositiveCategoriesLink() throws Exception {
		test = extent.createTest("Test 7 - Check PositiveCategories Link");
		DashboardItem.PositiveCategories(driver);

	}

	@Test(priority = 8)
	public void CheckpopularCategoriesLink() throws Exception {
		test = extent.createTest("Test 8 - Check popular Categories Link");
		DashboardItem.popularCategories(driver);

	}

	@Test(priority = 9)
	public void CheckPeopleCategoriesLink() throws Exception {
		test = extent.createTest("Test 9 - Check People Categories Link");
		DashboardItem.PeopleCategories(driver);

	}

	@Test(priority = 10)
	public void CheckVideosLink() throws Exception {
		test = extent.createTest("Test 10 - Check Videos Link");
		DashboardItem.Videos(driver);

	}

	@Test(priority = 11)
	public void CheckQuizLink() throws Exception {
		test = extent.createTest("Test 11 - Check Quiz Link");
		DashboardItem.Quize(driver);

	}

	@Test(priority = 12)
	public void CheckFeaturedPostImage() throws Exception {
		test = extent.createTest("Test 12 - Check Featured Post Image");
		DashboardItem.FeaturedPostImage(driver);

	}

	@Test(priority = 13)
	public void CheckFeaturedPostTitle() throws Exception {
		test = extent.createTest("Test 13 - Check Featured Post Title");
		DashboardItem.FeaturedPostContent(driver);

	}

	@Test(priority = 14)
	public void CheckFeaturedPostAuthor() throws Exception {
		test = extent.createTest("Test 14 - Check Featured Post Author");
		DashboardItem.FeaturedPostAuthor(driver);

	}

	@Test(priority = 15)

	public void CheckSecondPostImage() {
		test = extent.createTest("Test 15 - Check Second Post Image");

		DashboardItem.SecondPostImage(driver);
	}

	@Test(priority = 16)

	public void CheckSecondPostTitle() {
		test = extent.createTest("Test 16 - Check Second Post Title");

		DashboardItem.SecondPostContent(driver);
	}

	@Test(priority = 17)

	public void CheckSecondPostAuthor() {
		test = extent.createTest("Test 17 - Check Second Post Author");

		DashboardItem.SecondPostAuthor(driver);

	}

	@Test(priority = 18)
    public void CheckThirdPostImage() {
		test = extent.createTest("Test 18 - Check Third Post Image");

		DashboardItem.ThirdPostImage(driver);
	}

	@Test(priority = 19)
    public void CheckThirdPostTitle() {
		test = extent.createTest("Test 19 - Check Third Post Title");

		DashboardItem.ThirdPostContent(driver);
	}

	@Test(priority = 20)
    public void CheckThirdPostAuthor() {
		test = extent.createTest("Test 20 - Check Third Post Author");

		DashboardItem.ThirdPostAuthor(driver);
	}

	@Test(priority = 21)
    public void CheckLatestStoryImage() {
		test = extent.createTest("Test 21 - Check Latest Story Image");
		// *[@id="_2223202241376"]/g[3]/path[3]
		DashboardItem.LatestStoryImage(driver);
	}

	@Test(priority = 22)

	public void CheckLatestStoryTitle() {
		test = extent.createTest("Test 22 - Check Latest Story Title");

		DashboardItem.LatestStoryContent(driver);
	}

	@Test(priority = 23)

	public void CheckLatestStoryAuthor() throws InterruptedException {
		test = extent.createTest("Test 23 - Check Latest Story Author");

		DashboardItem.LatestStoryAuthor(driver);
	}

	@Test(priority = 24)

	public void CheckTheVideo1() throws InterruptedException {
		test = extent.createTest("Test 24 - Check first video");

		DashboardItem.video1(driver);

	}

	@Test(priority = 25)

	public void Checkvideo2() throws InterruptedException {
		test = extent.createTest("Test 25 - Check second video");

		DashboardItem.video2(driver);

	}

	@Test(priority = 26)

	public void CheckQuizeFeedImage() throws InterruptedException {
		test = extent.createTest("Test 26 - Check Quize Feed Image");

		DashboardItem.QuizeFeedImage(driver);

	}

	@Test(priority = 27)

	public void CheckQuizefeedTitle() throws InterruptedException {
		test = extent.createTest("Test 27 - Check Quize feed Title");

		DashboardItem.QuizefeedContent(driver);

	}

	@Test(priority = 28)

	public void QuizeFeedAuthor() throws InterruptedException {
		test = extent.createTest("Test 28 - Quize Feed Author");

		DashboardItem.QuizeFeedAuthor(driver);

	}

	@Test(priority = 29)

	public void CheckEatSleepReadReaptImage() throws InterruptedException {
		test = extent.createTest("Test 29 - Check Eat Sleep ReadReapt Image");

		DashboardItem.EatSleepReadReaptImage(driver);

	}

	@Test(priority = 30)

	public void CheckEatSleepReadReaptTitle() throws InterruptedException {
		test = extent.createTest("Test 30 - Check Eat Sleep ReadReapt Title");

		DashboardItem.EatSleepReadReaptContent(driver);

	}

	@Test(priority = 31)

	public void CheckEatSleepReadReaptAuthor() throws InterruptedException {
		test = extent.createTest("Test 31 - Check Eat SleepRead Reapt Author");

		DashboardItem.EatSleepReadReaptAuthor(driver);

	}

}
