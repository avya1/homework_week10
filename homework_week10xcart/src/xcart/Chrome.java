package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String url="https://www.x-cart.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);//used get method to get url
        driver.manage().window().maximize();//this method is  to get maximum size window screen
        String getTitle=driver.getTitle();//get title method used to get title but return string
        System.out.println(getTitle);//we put get title method in side sout so that get output in console
        //driver.close();//used to close object


    }
}
