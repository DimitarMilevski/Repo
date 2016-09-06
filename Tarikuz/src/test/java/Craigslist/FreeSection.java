package Craigslist;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tarikBase.Core;

/**
 * Created by tzaman on 9/3/16.
 */
public class FreeSection extends Core {

    @Test
    public void test() throws InterruptedException{
        driver.findElement(By.xpath(".//*[@id='sss1']/li[2]/a/span")).click();
        //driver.findElement(By.xpath(".//*[@id='pagecontainer']/section/div/ul/li[2]/a")).click();
        typeByXpath(".//*[@id='query']", "Table");
        sleepFor(2);
        typeByXpath(".//*[@id='searchform']/div[2]/div/div[3]/input[1]", "10");
        sleepFor(1);
        typeByXpath(".//*[@id='searchform']/div[2]/div/div[3]/input[2]", "22311");
        sleepFor(1);
        clickByXpath(".//*[@id='searchform']/div[2]/div/div[5]/button");

        Thread.sleep(3000);

    }
}
