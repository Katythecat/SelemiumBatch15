package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver=new ChromeDriver();

        //open the website facebook.com
        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //System.out.println(driver.getCurrentUrl());


        //get title of the webpage
        String title=driver.getTitle();
        System.out.println(title);
        //System.out.println(driver.getTitle());

        Thread.sleep(3000);

        driver.close();

    }
}
