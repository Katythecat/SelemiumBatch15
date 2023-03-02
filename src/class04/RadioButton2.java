package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //iterator over the list to see ur desired one
        for (WebElement radioBtn : radioBtns) {
            //System.out.println(radioBtn.getAttribute("value"));//0 - 5  ,5 - 15,  15 - 50
            String age = radioBtn.getAttribute("value");

            //if the value of web element is 5-15 click on it
            if (age.equals("5 - 15")) {
                radioBtn.click();
            }
        }
    }
}