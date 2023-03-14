package class06.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();


        WebElement finishBtn = driver.findElement(By.xpath("//div[@id='finish']//h4"));
        finishBtn.click();


        //System.out.println("Is Hello World displayed? "+finishBtn.isDisplayed());

        if(finishBtn.getText().equalsIgnoreCase("Hello World!")){
            System.out.println(finishBtn.getText()+" Is displayed");
        }else{
            System.out.println(finishBtn.getText()+" Is not displayed");
        }
    }
}