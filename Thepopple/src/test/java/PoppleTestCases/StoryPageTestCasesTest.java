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
import PopplePages.StoryPages;
import PoppleUtils.ReadPropertiesFilesPopple;

public class StoryPageTestCasesTest {

	static Properties properties = null;

//	WebDriver driver = new Chelement size = actions.toString();romeDriver();
//	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");

	String string = System.setProperty("webdriver.gecko.driver", "geckodriver");
	WebDriver driver = new FirefoxDriver();

	 Timeouts waiting = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	StoryPages StoryItem = new StoryPages();

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

	}

	

	
	@Test(priority = 1)
	public void OpenStoryPage() throws Exception {
		StoryItem.ClickFeaturedPost(driver);

	}
	@Test(priority = 2)
	public void CheckAdvertisementFrame() throws Exception {
		StoryItem.AdvertisementFrame(driver);

	}
	@Test(priority = 3)
	public void CheckStoryFirstImage() throws Exception {

		StoryItem.StoryFirstImage(driver);
	}

	@Test(priority = 4)
	public void CheckStoryAuthor() throws Exception {
		StoryItem.StoryAuthor(driver);

	}

	@Test(priority = 5)
	public void CheckStoryTitle() throws Exception {
		StoryItem.StoryTitle(driver);

	}

	@Test(priority = 6)
	public void CheckStoryDesc() throws Exception {
		StoryItem.StoryDesc(driver);

	}

	@Test(priority = 7)
	public void CheckStoryShares() throws Exception {
		StoryItem.StoryShares(driver);

	}

	@Test(priority = 8)
	public void CheckStoryShareOptions() throws Exception {
		StoryItem.StoryShareOptions(driver);

	}

	@Test(priority = 9)
	public void CheckStoryContent() throws Exception {
		StoryItem.StoryContent(driver);

	}
	
	@Test(priority = 10)
	public void CheckNextStoryFrame() throws Exception {
		StoryItem.NextStoryFrame(driver);

	}
	

}
