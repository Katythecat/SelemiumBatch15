package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement DD= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select=new Select(DD);

        List<WebElement> options = select.getOptions();
        System.out.println("Total number of options:"+options.size());//8
        for(WebElement option:options){
            System.out.println(option.getText()); //display all button
        }
        select.selectByValue("New Jersey");
        Thread.sleep(1000);
        select.selectByVisibleText("Ohio");
        Thread.sleep(1000);
        select.selectByIndex(0);
        Thread.sleep(1000);

        //unselect by using deselect
        select.deselectByValue("Ohio");

        System.out.println("Dropdown is multiple:"+select.isMultiple());

    }
}
