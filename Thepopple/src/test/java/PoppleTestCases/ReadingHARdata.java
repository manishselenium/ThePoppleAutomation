package PoppleTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PopplePages.CatagoriesPage;
import PoppleUtils.ReadPropertiesFilesPopple;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import de.sstoehr.harreader.HarReaderException;

public class ReadingHARdata {
	
	public static WebDriver driver;
	public static BrowserMobProxyServer proxy;

	@Test
	public void CreatHarFile() throws HarReaderException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		proxy = new BrowserMobProxyServer();
		proxy.start();

		Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
		try {
			String hostIp = Inet4Address.getLocalHost().getHostAddress();
			seleniumProxy.setHttpProxy(hostIp + ":" + proxy.getPort());
			seleniumProxy.setSslProxy(hostIp + ":" + proxy.getPort());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		DesiredCapabilities seleniumCapabilities = new DesiredCapabilities();

		ChromeOptions options = new ChromeOptions();

		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		seleniumCapabilities.setCapability(CapabilityType.PROXY, seleniumProxy);

		driver = new ChromeDriver(seleniumCapabilities);

		proxy.enableHarCaptureTypes(CaptureType.RESPONSE_HEADERS);

		try {

			proxy.newHar("swtestacademy");

			Timeouts waiting = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

			driver.navigate().to("http://www.reopener.com/long-weekends-2019-71868");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return window.stop");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Har har = proxy.getHar();

			File harFile = new File("/home/wittyfeed/thepopple.har");
			har.writeTo(harFile);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		driver.quit();
		proxy.stop();

	}

}
