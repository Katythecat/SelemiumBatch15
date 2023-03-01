package class03.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter')]")).sendKeys("Hello Selenium");
        driver.findElement((By.xpath("//button[text()='Show Message']"))).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("15");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        WebElement type=driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        System.out.println(type.getAttribute("type"));





        /*List<WebElement> buttons=driver.findElements(By.xpath("//button[contains(text(),'Get Total')]"));
        for(WebElement button:buttons){
            String value=button.getAttribute("type");
            System.out.println(value);
        }*/










    }
}
