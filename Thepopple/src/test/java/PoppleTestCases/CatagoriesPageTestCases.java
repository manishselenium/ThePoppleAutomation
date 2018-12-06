package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PopplePages.CatagoriesPage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class CatagoriesPageTestCases {

	static Properties properties = null;
	
	String st = System.setProperty("webdriver.chrome.driver", "chromedriver");
	WebDriver driver = new ChromeDriver();
	


	CatagoriesPage CatagoryItem = new CatagoriesPage();

	@BeforeTest
	public void OpenBrowser() throws IOException {

		ReadPropertiesFilesPopple readConfigFile = new ReadPropertiesFilesPopple();

		properties = readConfigFile.LoadPropertiess();

		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void ClickHamburgerMenu() throws Exception {

		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 2)
	public void CheckPositiveCata() throws Exception {
		CatagoryItem.PositiveCata(driver);

	}

	@Test(priority = 3)
	public void CheckPositiveSubCata() throws Exception {

		CatagoryItem.PositiveSubCata(driver);
	}

	@Test(priority = 4)
	public void CheckPopularCata() throws Exception {
		CatagoryItem.PopularCata(driver);

	}

	@Test(priority = 5)
	public void CheckPopularSubCata() throws Exception {
		CatagoryItem.PopularSubCata(driver);

	}

	@Test(priority = 6)
	public void CheckpeopleCata() throws Exception {
		CatagoryItem.peopleCata(driver);

	}

	@Test(priority = 7)
	public void CheckpeopleSubCata() throws Exception {

		CatagoryItem.peopleSubCata(driver);
	}

	@Test(priority = 8)
	public void CheckVideoLink() throws Exception {
		CatagoryItem.Videocata(driver);

	}
	
	@Test(priority = 26)
	public void CheckQuizLink() throws Exception {
		CatagoryItem.Quizcata(driver);

	}

	@Test(priority = 9)
	public void CheckPositivePage() throws Exception {
		CatagoryItem.Positive(driver);

	}

	@Test(priority = 10)
	public void CheckAnimalsPage() throws Exception {
		CatagoryItem.animals(driver);
	}

	@Test(priority = 11)
	public void CheckHumorPage() throws Exception {
		CatagoryItem.humor(driver);
	}

	@Test(priority = 12)
	public void CheckTravelPage() throws Exception {
		CatagoryItem.travel(driver);
	}

	@Test(priority = 13)
	public void CheckDiyPage() throws Exception {
		CatagoryItem.diy(driver);
	}

	@Test(priority = 14)
	public void CheckPopularPage() throws Exception {
		CatagoryItem.popular(driver);

	}

	@Test(priority = 15)
	public void CheckTerendingPage() throws Exception {
		CatagoryItem.Terending(driver);
	}

	@Test(priority = 16)
	public void CheckCulturePage() throws Exception {
		CatagoryItem.Culture(driver);
	}

	@Test(priority = 17)
	public void CheckSportsPage() throws Exception {
		CatagoryItem.Sports(driver);
	}

	@Test(priority = 18)
	public void CheckTechnologyPage() throws Exception {
		CatagoryItem.Technology(driver);
	}

	@Test(priority = 19)
	public void CheckPeoplePage() throws Exception {
		CatagoryItem.People(driver);
	}

	@Test(priority = 20)
	public void CheckEntertainmentPage() throws Exception {
		CatagoryItem.Entertainment(driver);
	}

	@Test(priority = 21)
	public void CheckLifestylePage() throws Exception {
		CatagoryItem.Lifestyle(driver);
	}

	@Test(priority = 22)
	public void CheckRelationshipPage() throws Exception {
		CatagoryItem.Relationship(driver);
	}

	@Test(priority = 23)
	public void CheckOpinionPage() throws Exception {
		CatagoryItem.Opinion(driver);

	}

	@Test(priority = 24)
	public void CheckVideoPage() throws Exception {
		CatagoryItem.Video(driver);

	}

	@Test(priority = 25)
	public void CheckQuizPage() throws Exception {
		CatagoryItem.Quiz(driver);

	}

	@AfterTest
	public void CloseBrowser() {

		driver.close();

	}

}
