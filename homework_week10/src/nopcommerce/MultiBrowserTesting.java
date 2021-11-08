package nopcommerce;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowserTesting {


    public static void multiBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){
             String url="https://www.nopcommerce.com/demo";
             System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
             WebDriver driver=new ChromeDriver();
             driver.get(url);
        }else if(browser.equalsIgnoreCase("firefox")){
             String url="https://www.nopcommerce.com/demo";
             System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
             WebDriver driver=new FirefoxDriver();
             driver.get(url);

        }else if(browser.equalsIgnoreCase("edge")){
             String url="https://www.nopcommerce.com/demo";
             System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
             WebDriver driver=new EdgeDriver();
             driver.get(url);
        }else {
            System.out.println("Wrong Browser Name");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter any browser name to open website  ");
        Scanner sc=new Scanner(System.in);
        String browser=sc.nextLine();
        multiBrowser(browser);


    }

}
