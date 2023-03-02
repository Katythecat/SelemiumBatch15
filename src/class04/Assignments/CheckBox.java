package class04.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        WebElement checkBoxBtn=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkBoxes=checkBoxBtn.isSelected();
        System.out.println("Is checked box selected? "+checkBoxes);
        if(!checkBoxes){
            checkBoxBtn.click();
        }
        checkBoxes=checkBoxBtn.isSelected();
        System.out.println("Is checked box selected? "+checkBoxes);




    }
}
