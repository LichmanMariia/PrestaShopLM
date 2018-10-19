package QATestLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter {

	public static void main(String[] args) {
		WebDriver driver = GetInitChromdriver();
		driver.manage().window().maximize();
		driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea&redirect=AdminDashboard");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("webinar.test@gmail.com");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Xcg7299bnSmMuRLp9ITw");
		WebElement enter = driver.findElement(By.name("submitLogin"));
		enter.submit();
		
				try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement icon = driver.findElement(By.id("employee_infos"));
		icon.click();

		WebElement icon1 = driver.findElement(By.id("header_logout"));
		icon1.click();
		
		driver.quit();
	}
public static WebDriver GetInitChromdriver() {
	System.setProperty("webdriver.chrome.driver", Enter.class.getResource("chromedriver.exe").getPath());
	return new ChromeDriver();
}
}


