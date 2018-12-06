package PopplePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import PoppleUtils.WrapperGenericMethod;

public class CatagoriesPage {

	By HomePageLogo = By.cssSelector(".brand-logo > svg:nth-child(1)");
	By HamburgerMenu = By.cssSelector(".sidenav-trigger > svg:nth-child(1)");
    By PositiveCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
    By PositiveSubCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By PopularCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > a:nth-child(1)");
    By PopularSubCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By peopleCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > a:nth-child(1)");
    By peopleSubCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By VideoCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > a:nth-child(1)");
    By QuizCata = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > a:nth-child(1)");
    
    By Positive = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > a:nth-child(1)");
    By Animals = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By Humor = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By Travel = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By Diy = By.cssSelector("li.vtpl_listMenu__section:nth-child(1) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
    By Popular = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > a:nth-child(1)");
    By Terending = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By Culture = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By Sports = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By Technology = By.cssSelector("li.vtpl_listMenu__section:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
    By People = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > a:nth-child(1)");
    By Entertainment = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
    By Lifestyle = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    By Relationship = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)");
    By Opinion = By.cssSelector("li.vtpl_listMenu__section:nth-child(3) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)");
	By Video = By.cssSelector("li.vtpl_listMenu__section:nth-child(4) > a:nth-child(1)");
	By Quiz = By.cssSelector("li.vtpl_listMenu__section:nth-child(5) > a:nth-child(1)");

	WrapperGenericMethod Action = new WrapperGenericMethod();


	public void ClickHamburgerMenu(WebDriver driver) {

		Action.Click(driver, HamburgerMenu);
	}

	public void PositiveCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(PositiveCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(PositiveCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void PositiveSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(PositiveSubCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(PositiveSubCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void PopularCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(PopularCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(PopularCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void PopularSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(PopularSubCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(PopularSubCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void peopleCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(peopleCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(peopleCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void peopleSubCata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(peopleSubCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(peopleSubCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void Videocata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(VideoCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(VideoCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void Quizcata(WebDriver driver) throws InterruptedException {
		WebElement element1 = driver.findElement(QuizCata);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		int Element = driver.findElements(QuizCata).size();
		Assert.assertEquals(Element, 1);
	}

	public void Positive(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Positive);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Positive);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/positive");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
		

	}

	public void animals(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Animals);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Animals);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/positive/animals");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void humor(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Humor);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Humor);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/positive/humor");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void travel(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Travel);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Travel);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/positive/travel");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void diy(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Diy);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Diy);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/positive/diy");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void popular(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Popular);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Popular);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/popular");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Terending(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Terending);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Terending);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/popular/trending");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Culture(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Culture);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Culture);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/popular/culture");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Sports(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Sports);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Sports);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/popular/sports");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Technology(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Technology);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Technology);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/popular/technology");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void People(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(People);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, People);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/people");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Entertainment(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Entertainment);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Entertainment);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/people/entertainment");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Lifestyle(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Lifestyle);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Lifestyle);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/people/lifestyle");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Relationship(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Relationship);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Relationship);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/people/relationship");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Opinion(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Opinion);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Opinion);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/people/opinion");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Video(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Video);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Video);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/videos");
		
		Action.Click(driver, HomePageLogo);
		Action.Click(driver, HamburgerMenu);
	}

	public void Quiz(WebDriver driver) throws InterruptedException {
		
		WebElement element1 = driver.findElement(Quiz);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Thread.sleep(1000);

		Action.Click(driver, Quiz);

		String URL = driver.getCurrentUrl();

		Assert.assertEquals(URL, "https://www.thepopple.com/quiz");
		
		Action.Click(driver, HomePageLogo);
		
	}

}
