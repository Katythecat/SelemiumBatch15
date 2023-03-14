package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSeceltor {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createNewBth=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewBth.click();
        Thread.sleep(2000);


        //fill the first name
        WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First name']"));
        firstName.sendKeys("Leo");
        //fill the last name
        WebElement lastName=driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Cutecat");






    }
}
