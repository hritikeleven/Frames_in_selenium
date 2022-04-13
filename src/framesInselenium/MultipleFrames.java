package framesInselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleFrames {
	@Test
	public void IDDemo() {
		System.setProperty("webdriver.chrome.driver"
				,"D:\\ECLIPSE dxc phase 2\\DXCLaunchChrome\\SeleniumChromeBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/game/COD/frame.html");
		int total_elements = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames ....."+ total_elements);
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("hritik1810@gmail.com");
		driver.findElement(By.id("log_password")).sendKeys("@jv@KXEgc493ps9");
		driver.findElement(By.xpath("//*[@id=\"log_frm\"]/div[4]/input[1]")).click();

}
}