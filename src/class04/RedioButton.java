package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //click on radio button
        //driver.findElement(By.xpath("//label[@class='radio-inline']/input[@name='optradio' and @value='Male']"))
        WebElement maleButton=driver.findElement(By.cssSelector("input[value='Male']"));

        //check if the radio button is enabled
        boolean isEnabledMale=maleButton.isEnabled();
        System.out.println("The radio button male is enable "+isEnabledMale);

        //check if the radio button is Displayed
        boolean isDisplayedMale=maleButton.isDisplayed();
        System.out.println("The radio button male is displayed "+isDisplayedMale);

        //check if the radio button is selected
        boolean isSelectedMale=maleButton.isSelected();
        System.out.println("The radio button male is selected "+isSelectedMale);

        //is the radio button is not selected click on it
        if(!isSelectedMale){
            maleButton.click();
        }

        //check if the radio button is selected after the click
        isSelectedMale=maleButton.isSelected();
        System.out.println("The statuc of selection is "+isSelectedMale);







    }
}
