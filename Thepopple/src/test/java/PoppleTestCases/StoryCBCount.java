package PoppleTestCases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StoryCBCount extends ReportGenerate{

	static WebElement story_div;
	
	@Test(priority=1)
	public void Story_CB_Count() {
		
		test = extent.createTest("Test 25 - Check Content Block Count");
		webdriver.get("https://www.thepopple.com/the-pursuit-of-happyness-movie-quotes-67349?utm_source=homepage_latest");
		JavascriptExecutor jse = (JavascriptExecutor) webdriver;
		//jse.executeScript("arguments[1].scrollIntoView();",story_images);
		//jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,800)");
		First_CB_count();		
		
		}

	public void First_CB_count() {
		// TODO Auto-generated method stub
		WebElement coverimage = webdriver.findElement(By.cssSelector("div.background--img"));
		
		if(coverimage.isDisplayed()==true){
			System.out.println("Cover image is displayed");
		}else{
			System.out.println("Cover image is not displayed");
		}
		
		WebElement coverimg_footer = webdriver.findElement(By.cssSelector(".vtpl_title"));
		if(coverimg_footer.isDisplayed()==true){
			System.out.println("footer is showing");
		}else{
			System.out.println("footer is not showing");
		}
		
		WebElement story_desc = webdriver.findElement(By.cssSelector("div.col:nth-child(7) > p:nth-child(1)"));
		if(story_desc.isDisplayed()==true){
			System.out.println("story description is showing");
		}else{//List<WebElement> next_cb_count = webdriver.findElements(By.className("vtpl-storyCard"));
			System.out.println("story description is not showing");
		}
		
		WebElement first_story_image = webdriver.findElement(By.cssSelector("div.vtpl-storyCard:nth-child(2) > div:nth-child(2) > div:nth-child(1) > img:nth-child(1)"));
		if(first_story_image.isDisplayed()==true){
			System.out.println("1 story image is showing");
		}else{
			System.out.println("1 story image is not showing");
		}
		
		if(coverimage.isDisplayed()==true&&coverimg_footer.isDisplayed()==true&&story_desc.isDisplayed()==true&&first_story_image.isDisplayed()==true){
			System.out.println("cb count is: 1");
		}else{
			System.out.println("cb count is: 1");
		}
		
		next_CB_count();		
	}
	
	public void next_CB_count(){
		
		//List<WebElement> next_cb_count = webdriver.findElements(By.className("vtpl-storyCard"));
		for(int i=2;i<=10;i++){
			JavascriptExecutor jse = (JavascriptExecutor) webdriver;
			for (int second = 0;; second++) {
			    if(second >=60){
			        break;
			    }			    
			webdriver.manage().timeouts().implicitlyWait(100000,TimeUnit.SECONDS);
			jse.executeScript("window.scrollBy(0,50)");
			}
					
			System.out.println("CB count is : "+i);	
		  }
	   }
}
