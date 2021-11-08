package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
     String url="https://www.x-cart.com";
     System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(url);//used get method to get url
        driver.manage().window().maximize();//this method is  to get maximum size window screen
        String getTitle=driver.getTitle();//get title method used to get title but return string
        System.out.println(getTitle);//we put get title method in side sout so that get output in console
        //driver.close();//used to close object

    }
}

