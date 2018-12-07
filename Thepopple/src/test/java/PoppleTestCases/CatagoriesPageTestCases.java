package PoppleTestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import PopplePages.CatagoriesPage;
import PoppleUtils.ReadPropertiesFilesPopple;

public class CatagoriesPageTestCases extends ReportGenerate {

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

		test = extent.createTest("Test 1 - Click hamburger menu");
		CatagoryItem.ClickHamburgerMenu(driver);

	}

	@Test(priority = 2)
	public void CheckPositiveCata() throws Exception {

		test = extent.createTest("Test 2 - Check Positive Catagory");
		CatagoryItem.PositiveCata(driver);

	}

	@Test(priority = 3)
	public void CheckPositiveSubCata() throws Exception {
		test = extent.createTest("Test 3 - Check Positive SubCatagory");
		CatagoryItem.PositiveSubCata(driver);
	}

	@Test(priority = 4)
	public void CheckPopularCata() throws Exception {
		test = extent.createTest("Test 4 - Check Popular Catagory");
		CatagoryItem.PopularCata(driver);

	}

	@Test(priority = 5)
	public void CheckPopularSubCata() throws Exception {
		test = extent.createTest("Test 5 - Check Popular SubCatagory");
		CatagoryItem.PopularSubCata(driver);

	}

	@Test(priority = 6)
	public void CheckpeopleCata() throws Exception {
		test = extent.createTest("Test 6 - Check people Catagory");
		CatagoryItem.peopleCata(driver);

	}

	@Test(priority = 7)
	public void CheckpeopleSubCata() throws Exception {
		test = extent.createTest("Test 7 - Check people SubCatagory");

		CatagoryItem.peopleSubCata(driver);
	}

	@Test(priority = 8)
	public void CheckVideoLink() throws Exception {
		test = extent.createTest("Test 8 - Check Video Link");
		CatagoryItem.Videocata(driver);

	}

	@Test(priority = 26)
	public void CheckQuizLink() throws Exception {
		test = extent.createTest("Test 26 - Check Quiz Link");
		CatagoryItem.Quizcata(driver);

	}

	@Test(priority = 9)
	public void CheckPositivePage() throws Exception {
		test = extent.createTest("Test 9 - Check Positive Page");
		CatagoryItem.Positive(driver);

	}

	@Test(priority = 10)
	public void CheckAnimalsPage() throws Exception {
		test = extent.createTest("Test 10 - Check Animals Page");
		CatagoryItem.animals(driver);
	}

	@Test(priority = 11)
	public void CheckHumorPage() throws Exception {
		test = extent.createTest("Test 11 - Check Humor Page");
		CatagoryItem.humor(driver);
	}

	@Test(priority = 12)
	public void CheckTravelPage() throws Exception {
		test = extent.createTest("Test 12 - Check Travel Page");
		CatagoryItem.travel(driver);
	}

	@Test(priority = 13)
	public void CheckDiyPage() throws Exception {
		test = extent.createTest("Test 13 - Check Diy Page");
		CatagoryItem.diy(driver);
	}

	@Test(priority = 14)
	public void CheckPopularPage() throws Exception {
		test = extent.createTest("Test 14 - Check Popular Page");
		CatagoryItem.popular(driver);

	}

	@Test(priority = 15)
	public void CheckTerendingPage() throws Exception {
		test = extent.createTest("Test 15 - Check Terending Page");
		CatagoryItem.Terending(driver);
	}

	@Test(priority = 16)
	public void CheckCulturePage() throws Exception {
		test = extent.createTest("Test 16 - Check Culture Page");
		CatagoryItem.Culture(driver);
	}

	@Test(priority = 17)
	public void CheckSportsPage() throws Exception {
		test = extent.createTest("Test 17 - Check Sports Page");
		CatagoryItem.Sports(driver);
	}

	@Test(priority = 18)
	public void CheckTechnologyPage() throws Exception {
		test = extent.createTest("Test 18 - Check Technology Page");
		CatagoryItem.Technology(driver);
	}

	@Test(priority = 19)
	public void CheckPeoplePage() throws Exception {
		test = extent.createTest("Test 19 - Check People Page");
		CatagoryItem.People(driver);
	}

	@Test(priority = 20)
	public void CheckEntertainmentPage() throws Exception {
		test = extent.createTest("Test 20 - Check Entertainment Page");
		CatagoryItem.Entertainment(driver);
	}

	@Test(priority = 21)
	public void CheckLifestylePage() throws Exception {
		test = extent.createTest("Test 21 - Check Lifestyle Page");
		CatagoryItem.Lifestyle(driver);
	}

	@Test(priority = 22)
	public void CheckRelationshipPage() throws Exception {
		test = extent.createTest("Test 22 - Check Relationship Page");
		CatagoryItem.Relationship(driver);
	}

	@Test(priority = 23)
	public void CheckOpinionPage() throws Exception {
		test = extent.createTest("Test 23 - Check Opinion Page");
		CatagoryItem.Opinion(driver);

	}

	@Test(priority = 24)
	public void CheckVideoPage() throws Exception {
		test = extent.createTest("Test 24 - Check Video Page");
		CatagoryItem.Video(driver);

	}

	@Test(priority = 25)
	public void CheckQuizPage() throws Exception {
		test = extent.createTest("Test 25 - Check Quiz Page");
		CatagoryItem.Quiz(driver);

	}

	@AfterTest
	public void CloseBrowser() {

		driver.close();

	}

}
