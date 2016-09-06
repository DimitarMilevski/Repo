package Craigslist;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tarikBase.Core;

/**
 * Created by tzaman on 9/3/16.
 */
public class CitySearch extends Core {

    @Test
    public void test() throws InterruptedException{
        //redirect to Craigslist cities
        driver.findElement(By.xpath(".//*[@id='logo']/a")).click();
        //looking for New york
        clickByXpath(".//*[@id='pagecontainer']/section/div[3]/div[3]/ul[7]/li[12]/a");
        //looking for Manhattan
        clickByXpath(".//*[@id='topban']/ul/li[1]/a");

        Thread.sleep(3000);

    }
}
