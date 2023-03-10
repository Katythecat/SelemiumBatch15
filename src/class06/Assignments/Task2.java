package class06.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement text=driver.findElement(By.xpath("//p"));
        text.clear();
        text.sendKeys("Hello World!");

        WebElement newText=driver.findElement(By.xpath("//body[@id='tinymce']//p"));
        System.out.println(newText.getText());

        if(newText.getText().equals("Hello World!")){
            System.out.println("New text is added");
        }else{
            System.out.println("Try again");
        }
        driver.switchTo().defaultContent();

    }
}
