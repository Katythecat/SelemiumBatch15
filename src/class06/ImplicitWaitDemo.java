package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.name("firstname")).sendKeys("Leo");
        driver.findElement(By.name("lastname")).sendKeys("Lovefish");
        driver.findElement(By.name("reg_email__")).sendKeys("leo@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("leo@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("leo1234");


        Select select=new Select(driver.findElement(By.id("month")));
        select.selectByVisibleText("May");
        select =new Select(driver.findElement(By.id("day")));
        select.selectByVisibleText("14");
        select=new Select(driver.findElement(By.id("year")));
        select.selectByVisibleText("2015");

        WebElement male= driver.findElement(By.xpath("//input[@value='2']"));
        male.click();



        driver.findElement(By.name("websubmit")).click();

    }
}
