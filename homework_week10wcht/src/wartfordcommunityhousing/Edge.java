package wartfordcommunityhousing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {
    public static void main(String[] args) {
        String url = "https://www.wcht.org.uk";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
         driver.get(url);//used get method to get url
        driver.manage().window().maximize();//this method is  to get maximum size window screen
        String getTitle=driver.getTitle();//get title method used to get title but return string
        System.out.println(getTitle);//we put get title method in side sout so that get output in console
        //driver.close();//used to close object

    }
}
