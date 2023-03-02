package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        //send in the username
        //driver.findElement(By.id("email")).sendKeys("jaeop");
        //send the password
        //driver.findElement(By.name("pass")).sendKeys("1234");
        //driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();





    }
}
