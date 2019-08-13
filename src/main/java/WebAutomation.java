import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Renuka\\Downloads\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();



        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I should see the userpage.");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://www.calculator.net/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Math Calculators")).click();

        driver.findElement(By.linkText("Percent Error Calculator")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[3]/td/img")).click();
        driver.findElement(By.id("observedvalue")).sendKeys("10");
        driver.close();



    }
}



