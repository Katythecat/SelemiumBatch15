package class02.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Katy");
        driver.findElement(By.id("customer.lastName")).sendKeys("TheCat");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 CatLand");
        driver.findElement(By.name("customer.address.city")).sendKeys("Hakunamatata");
        driver.findElement(By.name("customer.address.state")).sendKeys("Washington");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123-748-3614");
        driver.findElement(By.name("customer.ssn")).sendKeys("123-456-789");
        driver.findElement(By.name("customer.username")).sendKeys("cateatfish");
        driver.findElement(By.name("customer.password")).sendKeys("cat1234");
        driver.findElement(By.name("repeatedPassword")).sendKeys("cat1234");
        Thread.sleep(3000);

        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
