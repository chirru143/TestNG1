package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectiveModel.LoginPage;

public class TestCase_1  {
	public static WebDriver driver;
@Test
	public void test() throws Exception {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rm21174\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	   LoginPage lp=new LoginPage(driver);
	   lp.enterusername("rameshadepu");
	   Thread.sleep(3000);
	   lp.enterpassword("ramesh");
	   Thread.sleep(3000);
	   lp.clickonlogin();
	}
}
