package class04.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> option = driver.findElements(By.cssSelector("input[class *='cb1']"));
        for (WebElement check : option) {
            String checkbox = check.getAttribute("value");
            if (checkbox.equals("Option-4") && check.isEnabled() && !check.isSelected()) {
                check.click();
            }
        }
    }
}






