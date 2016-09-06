package Craigslist;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tarikBase.Core;

/**
 * Created by tzaman on 9/3/16.
 */
public class PriceLimit extends Core {
    @Test
    public void test1() throws InterruptedException{
        driver.findElement(By.xpath(".//*[@id='sss0']/li[13]/a/span")).click();
        driver.findElement(By.xpath(".//*[@id='pagecontainer']/section/div/ul/li[2]/a")).click();
        typeByXpath(".//*[@id='query']", "CR V");
        sleepFor(2);
        typeByXpath(".//*[@id='searchform']/div[2]/div/div[4]/input[1]", "1000");
        sleepFor(1);
        typeByXpath(".//*[@id='searchform']/div[2]/div/div[4]/input[2]", "9050");
        sleepFor(1);
        clickByXpath(".//*[@id='searchform']/div[2]/div/div[8]/button");

        Thread.sleep(3000);

    }

}
