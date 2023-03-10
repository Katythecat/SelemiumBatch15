package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        //switch to the iframe which contains the input box
        //method : by index
        //frame strat from index 1
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.id("name"));
        textbox.sendKeys("Hakunamatata");
        //get the text click on from parent window
        driver.switchTo().defaultContent();
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("The text is:"+text.getText());

        driver.switchTo().frame("iframe_a");
        WebElement label = driver.findElement(By.xpath("//label"));
        System.out.println("Lable of iframe is:"+label.getText());
        //switch to the parent page
        driver.switchTo().defaultContent();

        // 3 method switch to an iframe using Webelement
        //creat what ever is written in the text box
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textbox.clear();







    }
}