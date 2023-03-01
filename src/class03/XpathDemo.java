package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");



        // find username
        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
                username.sendKeys("Tester");


        //find password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        //clear the username text box using method clear()
        //username.clear();

        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String passText=passwordText.getText();
        System.out.println(passText);





       /* driver.findElement((By.xpath("//input[@type='submit']")));
        username.click();*/


    }
}
