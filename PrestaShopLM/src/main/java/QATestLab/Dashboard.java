package QATestLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

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
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		WebElement Dashboard = driver.findElement(By.id("tab-AdminDashboard"));
		Dashboard.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());

		WebElement order = driver.findElement(By.id("subtab-AdminParentOrders"));
		order.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement katalog = driver.findElement(By.id("subtab-AdminCatalog"));
		katalog.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement customer = driver.findElement(By.linkText("Клиенты"));
		customer.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement support = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
		support.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement statistic = driver.findElement(By.id("subtab-AdminStats"));
		statistic.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement modules = driver.findElement(By.id("subtab-AdminParentModulesSf"));
		modules.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement design = driver.findElement(By.linkText("Design"));
		design.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
				
		WebElement delivery = driver.findElement(By.id("subtab-AdminParentShipping"));
		delivery.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement pay = driver.findElement(By.id("subtab-AdminParentPayment"));
		pay.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement international = driver.findElement(By.id("subtab-AdminInternational"));
		international.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		WebElement parameters = driver.findElement(By.id("subtab-ShopParameters"));
		parameters.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());

		WebElement config = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
		config.click();
		System.out.println("Page title is:" + driver.getTitle());
		driver.navigate().refresh();
		System.out.println("Page title is:" + driver.getTitle());
		
		driver.quit();
	}
	public static WebDriver GetInitChromdriver() {
		System.setProperty("webdriver.chrome.driver", Enter.class.getResource("chromedriver.exe").getPath());
		return new ChromeDriver();
}
}