package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));


        for(WebElement checkbox:checkBoxes){
            String value=checkbox.getAttribute("value");
                if(value.equalsIgnoreCase("Option-2")){
                    checkbox.click();
                }
            }

        Thread.sleep(2000);
        //unclick by using .click() again
        for(WebElement checkbox:checkBoxes){
            String value=checkbox.getAttribute("value");
            if(value.equalsIgnoreCase("Option-2")){
                checkbox.click();
            }
        }

        }


        /*for (int i = 0; i < checkBoxes.size(); i++) {
            String value = checkBoxes.get(i).getAttribute("value");
            //check if this is the desired one
            //if yes click it
            //if no continue to iterate
            if (value.equalsIgnoreCase("Option-2")) {
                checkBoxes.get(i).click();
            }
        }*/
       /* for (int i = 0; i < checkBoxes.size(); i++) {
           String value=checkBoxes.get(i).getAttribute("value");
           if(value.equals("Option-2")){
               checkBoxes.get(i).click();
           }


            }*/
        }
