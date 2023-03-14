package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //locate the webelement
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select=new Select(dropDown);
        select.selectByIndex(3);
        Thread.sleep(1500);
        select.selectByValue("Monday");
        Thread.sleep(1500);
        select.selectByVisibleText("Sunday");






    }

}
