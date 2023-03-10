package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");

        //click on the button for simple prompt alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //use switchTo
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1500);
        alert.accept();//use when we want to click ok
        // alert.dismiss(); use when we want to cancel
        Thread.sleep(1500);
        //hey click on the prompt alert button
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch the focus to alert
        Thread.sleep(1500);
        alert.sendKeys("Leo");
        //accept it
        alert.accept();


    }
}
