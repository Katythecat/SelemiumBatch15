package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;


public class WindowHandleDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S235366521%3A1678243105674477&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdOvog3wmr_8f9PP_fnU0-OK5rd4VySXVeCRfK4HMg-IuuE_eSVo9TNWT1bmnXCl0q-DtZ_0w");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();

        //get the window handle of the parent window
        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);//this number is dynamic

        //get window handles of all the windows that have been opened up
        //put in Set bc it not allowed duplicate
        Set<String> allWindows = driver.getWindowHandles();
        for(String wd:allWindows) {
            //switch to focus of the driver to help window
            driver.switchTo().window(wd);
            //check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        //to verify we switched to the right window
       System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindow);









    }
}
