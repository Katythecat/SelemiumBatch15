package class02.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Leo");
        driver.findElement(By.name("lastname")).sendKeys("Lovefish");
        driver.findElement(By.name("reg_email__")).sendKeys("leo@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("leo@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("leo1234");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);

        driver.quit();

    }
}
