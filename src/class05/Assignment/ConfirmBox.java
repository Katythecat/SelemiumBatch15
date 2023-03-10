package class05.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ConfirmBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        String text=alert.getText();
        if(text.equals("Press a button!")){
            System.out.println("Correct alert message");
        }else{
            System.out.println("In-correct alert message");
        }
        Thread.sleep(2000);
        alert.accept();
        //alert.dismiss(); click on cancel button






    }
}
