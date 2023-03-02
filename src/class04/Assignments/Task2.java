package class04.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        int select=4;

        if(select==1){
            driver.findElement(By.cssSelector("input[value='Option-1']")).click();
        }else if(select==2){
            driver.findElement(By.cssSelector("input[value='Option-2']")).click();
        }else if(select==3){
            driver.findElement(By.cssSelector("input[value='Option-3']")).click();
        }else if(select==4){
            driver.findElement(By.cssSelector("input[value='Option-4']")).click();
        }else{
            System.out.println("Invalid");
        }
    }
}
