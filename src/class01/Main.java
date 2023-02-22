package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        String path="https://www.google.com/";
        driver.get(path);
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();

        System.out.println(path);
        System.out.println(url);

        if (path.equalsIgnoreCase(url)) {
            System.out.println("Match");
        }else{
            System.out.println("Not Match");
        }

        if(title.equalsIgnoreCase("google")){
            System.out.println("Match");
        }else{
            System.out.println("Not Match");
        }

        /*System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());*/

        driver.quit();
    }
}