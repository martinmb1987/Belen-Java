package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getenv());
        System.out.println(System.getProperty("user.dir"));
        String driverPath = System.getProperty("user.dir")+"/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        WebElement searchButton= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchButton.sendKeys("Selenium", Keys.RETURN);
        Thread.sleep(3000);
        driver.quit();


    }
}
